import sys

n, a, b = [int(c) for c in sys.stdin.readline().strip().split(" ")]
ans = min(b, a * n)
print(ans)
