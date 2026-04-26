DRY_RUN_CONFIG = {
    "base_model": "Qwen/Qwen2.5-Coder-7B-Instruct",
    "dataset": {
        "dataset_name": "zzzghttt/context2test",
        "split": "train",
        "max_samples": 256,
        "max_seq_length": 512,
    },
    "quantization": {
        "load_in_4bit": True,
        "bnb_4bit_use_double_quant": True,
        "bnb_4bit_quant_type": "nf4",
        "bnb_4bit_compute_dtype": "bfloat16",
    },
    "lora": {
        "r": 8,
        "lora_alpha": 16,
        "target_modules": ["q_proj", "v_proj"],
        "lora_dropout": 0.05,
        "bias": "none",
        "task_type": "CAUSAL_LM",
    },
    "training": {
        "num_train_epochs": 1,
        "max_steps": 40,
        "per_device_train_batch_size": 1,
        "gradient_accumulation_steps": 2,
        "learning_rate": 2e-4,
        "lr_scheduler_type": "cosine",
        "warmup_ratio": 0.03,
        "gradient_checkpointing": True,
        "optim": "paged_adamw_32bit",
        "logging_steps": 5,
        "save_strategy": "steps",
        "save_steps": 20,
        "save_total_limit": 1,
        "report_to": "none",
        "max_grad_norm": 0.3,
        "group_by_length": True,
        "fp16": True,
        "bf16": False,
    },
    "generation": {
        "max_input_tokens": 512,
        "max_new_tokens": 128,
        "temperature": 0.6,
        "top_p": 0.95,
    },
}


def print_dry_run_summary() -> None:
    dataset_config = DRY_RUN_CONFIG["dataset"]
    training_config = DRY_RUN_CONFIG["training"]
    lora_config = DRY_RUN_CONFIG["lora"]

    print("Dry run configuration loaded")
    print(f"- max_samples: {dataset_config['max_samples']}")
    print(f"- max_seq_length: {dataset_config['max_seq_length']}")
    print(f"- lora r/alpha: {lora_config['r']}/{lora_config['lora_alpha']}")
    print(f"- epochs: {training_config['num_train_epochs']}, max_steps: {training_config['max_steps']}")
    print(
        f"- batch: {training_config['per_device_train_batch_size']} x "
        f"{training_config['gradient_accumulation_steps']} (grad accumulation)"
    )
