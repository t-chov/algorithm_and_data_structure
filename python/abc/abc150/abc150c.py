from itertools import permutations

N = int(input())
P = list(map(int, input().split()))
Q = list(map(int, input().split()))

orig = [i for i in range(1, N + 1)]
a, b = (0, 0)
for i, x in enumerate(permutations(orig, N)):
    x = list(x)
    # print(x)
    if x == P:
        a = i
    if x == Q:
        b = i

print(abs(a - b))
