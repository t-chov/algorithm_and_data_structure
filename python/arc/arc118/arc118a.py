(t, N) = map(int, input().split())

exc = []
prev = 0
for i in range(1, 101):
    n = (100 + t) * i // 100
    for x in range(prev + 1, n):
        exc.append(x)
    prev = n

exc_len = len(exc)
bai = (N - 1) // exc_len
mod = (N - 1) % exc_len

ans = (100 + t) * bai + exc[mod]
print(ans)
