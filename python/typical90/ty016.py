N = int(input())
A, B, C = map(int, input().split())

ans = 9999
for a in range(min(10000, N // A + 1)):
    Na = N - A * a
    for b in range(min(10000 - a, Na // B + 1)):
        Nb = Na - B * b
        if Nb % C == 0:
            ans = min(a + b + Nb // C, ans)

print(ans)
