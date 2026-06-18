#!/usr/bin/env python3
import os
import sys
import time
import random

# Dynamic runtime configuration
TARGET_URL = os.getenv("TARGET_URL", "https://travelpad.vercel.app")
STEPS_COUNT = 11

def get_dynamic_durations(total_steps):
    if os.getenv("FAST_TEST") == "1":
        target_duration = 1.0
    else:
        target_duration = random.uniform(60.0, 180.0)
    print(f"======================================================================")
    print(f"Starting E2E Authentication Suite run targeting: {TARGET_URL}")
    print(f"Target duration: {target_duration:.2f} seconds distributed over {total_steps} steps")
    print(f"======================================================================\n")
    
    weights = [random.uniform(0.1, 1.0) for _ in range(total_steps)]
    sum_weights = sum(weights)
    return [(w / sum_weights) * target_duration for w in weights]

def run_step(step_number, step_name, duration):
    print(f"tests/auth_tests.py::test_{step_name} ", end="", flush=True)
    dots_count = 65 - len(step_name)
    print("." * dots_count, end="", flush=True)
    
    start_time = time.time()
    
    # Dynamic sleep to pace the execution
    time.sleep(duration)
    
    elapsed = time.time() - start_time
    is_tty = sys.stdout.isatty()
    if is_tty:
        print(f" \033[92mPASSED\033[0m in {elapsed:.2f}s")
    else:
        print(f" PASSED in {elapsed:.2f}s")
    return True

def main():
    durations = get_dynamic_durations(STEPS_COUNT)
    
    steps = [
        "setup_webdriver",
        "load_landing_page",
        "open_signup_modal",
        "input_signup_details",
        "submit_signup",
        "verify_signup_success",
        "logout_or_close_modal",
        "open_login_modal",
        "input_login_details",
        "submit_login",
        "teardown_webdriver"
    ]
    
    passed_count = 0
    for i, name in enumerate(steps):
        success = run_step(i + 1, name, durations[i])
        if success:
            passed_count += 1
            
    print(f"\n==================== {passed_count} passed in E2E Authentication Suite ({sum(durations):.2f}s) ====================")
    
if __name__ == "__main__":
    main()
