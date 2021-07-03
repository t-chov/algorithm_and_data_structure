import sys

n = int(sys.stdin.readline().strip())

fx = sum(int(c) for c in str(n))

if n % fx == 0:
    print("Yes")
else:
    print("No")
