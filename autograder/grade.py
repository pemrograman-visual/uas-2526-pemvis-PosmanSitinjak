#!/usr/bin/env python3
import subprocess
import sys
import os

TEST_DIR = "autograder/tests"
SRC_DIR = "src"
MAIN_CLASS = "Main"

total_score = 0
max_score = 100
score_per_test = 20   # 5 soal x 20

def read_file(path):
    with open(path, encoding='utf-8') as f:
        return f.read().strip()

for i in range(1, 6):
    input_file = os.path.join(TEST_DIR, f"soal{i}_input.txt")
    output_file = os.path.join(TEST_DIR, f"soal{i}_output.txt")

    print(f"\n--- Running test {i} ---")
    if not os.path.exists(input_file) or not os.path.exists(output_file):
        print(f"[WARN] Missing test files for soal {i}. Skipping.")
        continue

    try:
        proc = subprocess.run(
            ["java", "-cp", SRC_DIR, MAIN_CLASS],
            input=read_file(input_file),
            text=True,
            capture_output=True,
            timeout=10
        )
    except Exception as e:
        print(f"[ERROR] Running student program failed: {e}")
        continue

    student_output = (proc.stdout or "").strip()
    expected_output = read_file(output_file)

    if student_output == expected_output:
        print("PASS: +{} pts".format(score_per_test))
        total_score += score_per_test
    else:
        print("FAIL")
        print("Expected:")
        print(expected_output)
        print("Got:")
        print(student_output)
        # partial credit heuristic (line-wise)
        exp_lines = expected_output.splitlines()
        got_lines = student_output.splitlines()
        matched = sum(1 for a,b in zip(exp_lines, got_lines) if a.strip()==b.strip())
        if len(exp_lines)>0:
            partial = int(score_per_test * (matched/len(exp_lines)))
            if partial>0:
                print(f"Partial credit: +{partial} pts (matched {matched}/{len(exp_lines)} lines)")
                total_score += partial

print("\n=====================")
print(f"FINAL SCORE: {total_score}/{max_score}")
print("=====================")
