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

## Step 3 — start the server
Open two terminal windows side by side. In terminal 1, run:

```bash
./run.sh server
```

Wait for the "Tunnel URL" line to appear before proceeding to terminal 2, this usually takes a couple of minutes.

## Step 4 — run evaluations

Run the modes sequentially:

```bash
# Hybrid dynamic
./run.sh eval-hybrid
./run.sh merge-hybrid

# Static
./run.sh eval-static
./run.sh merge-static
```

## Step 5 — inspect results

Once the merge steps are done, open `compare_test_quality_light.ipynb` to compare the baseline, the static, and the hybrid models.

---

Notice: I've already generated the test data and put it in Eval/pdfbox_dataset. You can directly run training steps for evaluation.

---

# Steps to follow for collecting runtime object dataset with PDFBox

## Step 1 — build Runtime2Test

**Prerequisites:** JDK 17+, Maven 3.8+

```bash
mvn -DskipTests package
Output: runtime2test-engine/target/runtime2test-engine.jar

This JAR serves as both the main executable and the Java Agent.
```

## Step 2 — clone and build PDFBox

```bash
git clone https://github.com/apache/pdfbox.git
cd pdfbox
mvn -DskipTests package
```

## Step 3 — copy the test PDF

```bash
Copy runtime2test-engine/src/test/resources/CodeMonkey.pdf to the root directory of the PDFBox project.
```

## Step 4 — create a config file

```bash
Choose the config that matches your OS. Example configs are in runtime2test-engine/src/test/resources/.

Linux/Mac — create your own based on pdfbox.json:

{
  "filterTests": true,
  "ignoreCoverage": true,
  "usedEquality": "ASSERT_J_DEEP",
  "projectPath": "/absolute/path/to/pdfbox",
  "methodsJson": "/tmp/rtf/methods.json",
  "dataPath": "/tmp/rtf/data",
  "testBasePath": "/tmp/rtf/generated-tests/src/test/java",
  "productionCommand": "'/absolute/path/to/Runtime2Test/runtime2test-engine/src/test/resources/run_pdfbox.sh' {{agent_call}}"
}

Windows — use or adapt pdfbox_windows.json:
{
  "filterTests": true,
  "ignoreCoverage": true,
  "usedEquality": "ASSERT_J_DEEP",
  "projectPath": "C:/path/to/pdfbox",
  "methodsJson": "rtf/methods.json",
  "dataPath": "rtf/data",
  "testBasePath": "rtf/generated-tests/src/test/java",
  "productionCommand": "call \"C:/path/to/Runtime2Test/runtime2test-engine/src/test/resources/run_pdfbox_windows.cmd\" {{agent_call}}"
}

```

## Step 5 — run data collection and test generation

```bash
Windows:

java -jar runtime2test-engine/target/runtime2test-engine.jar --statistics runtime2test-engine/src/test/resources/pdfbox_windows.json

Linux/Mac:

java -jar runtime2test-engine/target/runtime2test-engine.jar --statistics runtime2test-engine/src/test/resources/pdfbox.json
```
