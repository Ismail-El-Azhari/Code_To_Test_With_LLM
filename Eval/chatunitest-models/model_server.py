"""Flask server that loads a fine-tuned Qwen2.5-Coder-7B model 
and serves test generation."""

import json
import os
import re
import shutil
import subprocess
import threading
import time

import torch
from flask import Flask, jsonify, request
from peft.peft_model import PeftModel
from transformers import (
    AutoModelForCausalLM,
    AutoTokenizer,
    BitsAndBytesConfig,
    GenerationConfig,
)

app = Flask(__name__)

stats = {
    "total_requests": 0,
    "success_count": 0,
    "error_count": 0,
    "total_inference_time_ms": 0.0,
    "total_tokens_generated": 0,
}

device = os.environ.get("MODEL_DEVICE") or (
    "cuda" if torch.cuda.is_available() else ("mps" if torch.backends.mps.is_available() else "cpu")
)
BASE_MODEL = "Qwen/Qwen2.5-Coder-7B-Instruct"
ADAPTER_MODEL = os.path.join(os.path.dirname(os.path.dirname(__file__)), "my-testgen-lora-light")

tokenizer = AutoTokenizer.from_pretrained(BASE_MODEL)
tokenizer.pad_token = tokenizer.eos_token
tokenizer.padding_side = "right"


def load_base_model():
    if device == "cuda":
        model_dtype = torch.bfloat16 if torch.cuda.is_bf16_supported() else torch.float16
        bnb_config = BitsAndBytesConfig(
            load_in_4bit=True,
            bnb_4bit_use_double_quant=True,
            bnb_4bit_quant_type="nf4",
            bnb_4bit_compute_dtype=model_dtype,
        )
        try:
            return AutoModelForCausalLM.from_pretrained(
                BASE_MODEL,
                quantization_config=bnb_config,
                device_map="auto",
                torch_dtype=model_dtype,
            )
        except ValueError as exc:
            if "dispatched on the CPU or the disk" not in str(exc):
                raise
            print(
                "[model] 4-bit CUDA load failed (insufficient VRAM). "
                "Falling back to CPU. Set MODEL_DEVICE=cpu to skip the CUDA attempt."
            )

    # low_cpu_mem_usage loads weights layer-by-layer to keep peak RAM lower.
    fallback_device = "mps" if device == "mps" else "cpu"
    fallback_model = AutoModelForCausalLM.from_pretrained(
        BASE_MODEL,
        torch_dtype=torch.float16,
        low_cpu_mem_usage=True,
    )
    fallback_model.to(fallback_device)
    return fallback_model


model = load_base_model()
model = PeftModel.from_pretrained(model, ADAPTER_MODEL)
model.config.use_cache = False
model.config.pretraining_tp = 1
model.eval()


def _format_static_snapshot(raw: str) -> str:
    """Convert staticSnapshot JSON into plain Java source text matching training format."""
    if not raw:
        return ""
    try:
        snapshot = json.loads(raw)
    except Exception:
        return raw
    parts = [m.get("sourceSnippet", "").strip() for m in snapshot.get("methods", [])]
    return "\n\n".join(p for p in parts if p) or raw


def _format_runtime_facts(raw: str) -> str:
    """Summarise runtimeFacts JSON as readable comments the model can use.

    Training data had empty runtimeFacts; the compact comment block lets the model
    see real observed values without format shock.
    """
    if not raw:
        return ""
    try:
        facts = json.loads(raw)
    except Exception:
        return raw
    lines = []
    for m in facts.get("methods", []):
        mid = m.get("methodId", "")
        ret_vals = m.get("returnedValues") or []
        param_vals = m.get("parameterValues") or []
        if ret_vals or param_vals:
            lines.append(f"// Runtime observations for {mid.split('#')[-1]}:")
            if ret_vals:
                lines.append(f"//   returned: {', '.join(str(v) for v in ret_vals[:3])}")
            if param_vals:
                lines.append(f"//   params:   {', '.join(str(v) for v in param_vals[0][:5])}")
    return "\n".join(lines)


def tokenize(text):
    result = tokenizer(
        text,
        truncation=True,
        max_length=2048,
        padding=False,
        return_tensors="pt",
    )
    return result["input_ids"].to(device)


def generate(text: str, max_tokens: int = 512, temperature: float = 0.6):
    generation_config = GenerationConfig(
        do_sample=True,
        temperature=temperature,
        top_p=0.9,
        repetition_penalty=1.3,
        eos_token_id=tokenizer.eos_token_id,
        pad_token_id=tokenizer.pad_token_id,
    )
    input_ids = tokenize(text)
    with torch.no_grad():
        result = model.generate(
            input_ids=input_ids,
            generation_config=generation_config,
            output_scores=True,
            max_new_tokens=max_tokens,
        )
    return result


def extract_clean_test_methods(text: str) -> list[str]:
    """Extract @Test method blocks using brace-depth counting, dropping trailing garbage."""
    first = text.find("@Test")
    if first == -1:
        return []
    parts = re.split(r'(?=@Test)', text[first:])
    methods = []
    for part in parts:
        part = part.strip()
        if not part.startswith("@Test") or "{" not in part:
            continue
        depth = 0
        end = -1
        in_str = False
        for i, ch in enumerate(part):
            if ch == '"' and (i == 0 or part[i - 1] != '\\'):
                in_str = not in_str
            if in_str:
                continue
            if ch == '{':
                depth += 1
            elif ch == '}':
                depth -= 1
                if depth == 0:
                    end = i + 1
                    break
        methods.append(part[:end] if end != -1 else part)
    return methods


@app.route('/stats', methods=['GET'])
def get_stats():
    avg_ms = (
        stats["total_inference_time_ms"] / stats["success_count"]
        if stats["success_count"] > 0 else 0
    )
    return jsonify({
        "total_requests": stats["success_count"] + stats["error_count"],
        "success_count": stats["success_count"],
        "error_count": stats["error_count"],
        "avg_inference_time_ms": round(avg_ms, 1),
        "total_tokens_generated": stats["total_tokens_generated"],
    })


@app.route('/generation', methods=['POST'])
def completion():
    data = request.get_json(silent=True) or {}
    stats["total_requests"] += 1

    try:
        if 'input' in data:
            # Legacy protocol: raw prompt string
            prompt = data['input']
            static_snapshot_raw = ""
            static_text = ""
        else:
            # Runtime2Test structured request
            mode = data.get('mode', 'UNKNOWN')
            project_path = data.get('projectPath', '')
            assertion_style = data.get('assertionStyle', 'JUNIT')
            static_snapshot_raw = data.get('staticSnapshot', '')
            runtime_facts_raw = data.get('runtimeFacts', '')

            static_text = _format_static_snapshot(static_snapshot_raw)
            runtime_text = _format_runtime_facts(runtime_facts_raw)

            # Always use mode=COMPLETION to match training format exactly.
            prompt = (
                f"mode=COMPLETION\n"
                f"projectPath={project_path}\n"
                f"assertionStyle={assertion_style}\n"
                f"staticSnapshot:\n{static_text}\n"
                f"runtimeFacts:\n{runtime_text}\n"
                f"### JUnit Test:\n"
            )

        input_ids = tokenizer(prompt, return_tensors="pt")["input_ids"]
        input_tokens = input_ids.shape[1]

        t_start = time.time()
        output_ids = generate(prompt)
        inference_time_ms = (time.time() - t_start) * 1000

        generated_ids = output_ids[0][input_tokens:]
        output_tokens = len(generated_ids)
        result = tokenizer.decode(generated_ids, skip_special_tokens=True)

        # Truncate at any prompt bleed-through markers
        for stop_marker in ["runtimeFacts:", "### JUnit Test:", "staticSnapshot:"]:
            idx = result.find(stop_marker)
            if idx != -1:
                result = result[:idx].strip()

        # Infer the declaring class name from the static snapshot
        declaring_class = "HybridRocky"
        cls_match = re.search(r'"methodId"\s*:\s*"([^"#]+)#', static_snapshot_raw)
        if not cls_match:
            cls_match = re.search(r'(?:class|interface)\s+(\w+)', static_text)
        if cls_match:
            declaring_class = cls_match.group(1).split('.')[-1]

        test_methods = extract_clean_test_methods(result)
        body = "\n\n".join(m.strip() for m in test_methods) if test_methods else result.strip()

        result = (
            f"package se.kth.castor.generated;\n\n"
            f"import org.junit.jupiter.api.Test;\n"
            f"import static org.junit.jupiter.api.Assertions.*;\n\n"
            f"public class {declaring_class}RockyTest {{\n\n"
            f"{body}\n\n"
            f"}}"
        )

        stats["success_count"] += 1
        stats["total_inference_time_ms"] += inference_time_ms
        stats["total_tokens_generated"] += output_tokens

        return jsonify({
            "success": True,
            "message": "ok",
            "stats": {
                "inference_time_ms": round(inference_time_ms, 1),
                "input_tokens": input_tokens,
                "output_tokens": output_tokens,
            },
            "files": [
                {
                    "relativePath": f"se/kth/castor/generated/{declaring_class}RockyTest.java",
                    "content": result,
                }
            ],
        }), 200

    except Exception as e:
        stats["error_count"] += 1
        return jsonify({
            "success": False,
            "message": str(e),
            "files": [],
        }), 200


def start_cloudflare_tunnel(port: int) -> None:
    """Start a cloudflared tunnel in a background thread and print the public URL."""
    binary = shutil.which("cloudflared") or os.path.expanduser("~/cloudflared")
    if not os.path.isfile(binary):
        print(
            "[tunnel] cloudflared not found. Install it with:\n"
            "  curl -L https://github.com/cloudflare/cloudflared/releases/latest/download/"
            "cloudflared-linux-amd64 -o ~/cloudflared && chmod +x ~/cloudflared"
        )
        return

    def _run():
        proc = subprocess.Popen(
            [binary, "tunnel", "--url", f"http://localhost:{port}"],
            stdout=subprocess.PIPE,
            stderr=subprocess.STDOUT,
            text=True,
        )
        if proc.stdout is None:
            return
        for line in proc.stdout:
            print(f"[tunnel] {line}", end="")
            match = re.search(r"https://[a-zA-Z0-9-]+\.trycloudflare\.com", line)
            if match:
                print(f"\n[tunnel] Public URL: {match.group(0)}/generation\n")

    threading.Thread(target=_run, daemon=True).start()


if __name__ == '__main__':
    start_cloudflare_tunnel(1234)
    app.run(debug=False, port=1234, threaded=True)
