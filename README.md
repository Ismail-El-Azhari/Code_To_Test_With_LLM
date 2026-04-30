# Steps to follow for training
**Important note: the model has already been trained, so you can skip to the evaluation steps.**
However, if you want to train the model yourself. Run train_colab_light.ipynb for the light version of the model, or train_colab.ipynb for the full version of the model.

# Steps to follow for evaluation

## Step 1 - navigate to the eval directory
Run the following command to navigate to the eval directory:

```bash 
cd eval
```
## Step 2 — setud
Install dependencies:
**Python 3.12** (tested on 3.12.11).

```bash
pip install -r requirements.txt
```

Or install individually:

```bash
pip install flask torch transformers peft accelerate bitsandbytes
```

<!-- The base model is downloaded automatically from Hugging Face on first run:
- Base model: `Qwen/Qwen2.5-Coder-7B-Instruct` -->

### Step 3 — start the server
Open two terminal windows side by side. In terminal 1, run:

```bash
./run.sh server
```

Wait for the "Tunnel URL" line to appear before proceeding to terminal 2, this usually takes a couple of minutes.

### Step 4 — run evaluations

Run the modes sequentially:

```bash
# Hybrid dynamic
./run.sh eval-hybrid
./run.sh merge-hybrid

# Static
./run.sh eval-static
./run.sh merge-static
```

### Step 5 — inspect results

Once the merge steps are done, open `compare_test_quality_light.ipynb` to compare the baseline, the static, and the hybrid models.

---