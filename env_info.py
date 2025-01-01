import sys
import os

print("Python executable:", sys.executable)
print("Python version:", sys.version)
print("Environment variables:")
for key, value in os.environ.items():
    print(f"{key}: {value}")
