N, K = map(int, input().split())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

mininum = 0
for a, b in zip(A, B):
    mininum += abs(a - b)

if K >= mininum and (K - mininum) % 2 == 0:
    print("Yes")
else:
    print("No")
