#!/usr/bin/env python3
"""Smoke-test: verify that load_invocation_facts populates returnedValues and parameterValues.

Run from any directory:
    python3 test_runtime_facts.py [path/to/pdfbox_dataset]

Defaults to <project-root>/pdfbox_dataset when no argument is given.
"""

import sys
from pathlib import Path

# Resolve project root (four levels above this file's LLM/ directory)
_HERE = Path(__file__).resolve().parent
_PROJECT_ROOT = _HERE.parents[4]

sys.path.insert(0, str(_HERE))
from method_level_scheduler import build_runtime_facts_payload, load_invocation_facts


def main() -> None:
    data_path = Path(sys.argv[1]) if len(sys.argv) > 1 else _PROJECT_ROOT / "pdfbox_dataset"
    invocations_path = data_path / "invocations.json"

    if not invocations_path.exists():
        print(f"ERROR: {invocations_path} not found. Pass the dataset path as an argument.")
        sys.exit(1)

    print("Loading invocation facts...")
    per_method, total = load_invocation_facts(invocations_path, max_shapes=5)
    print(f"Total invocation lines : {total}")
    print(f"Unique methods         : {len(per_method)}\n")

    for method_id, facts in list(per_method.items())[:3]:
        print(f"Method: {method_id}")
        print(f"  invocation_count : {facts.invocation_count}")
        print(f"  returned_values  : {facts.returned_values}")
        print(f"  parameter_values : {facts.parameter_values}")

        payload = build_runtime_facts_payload(method_id, per_method, total)
        method_payload = payload["methods"][0]
        print(f"  payload returnedValues  : {method_payload['returnedValues']}")
        print(f"  payload parameterValues : {method_payload['parameterValues']}")
        status = "OK" if method_payload["returnedValues"] else "EMPTY"
        print(f"  returnedValues: {status}\n")


if __name__ == "__main__":
    main()
