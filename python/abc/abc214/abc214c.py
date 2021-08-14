N = int(input())
S = list(map(int, input().split()))
T = list(map(int, input().split()))

dp = [ 2 ** 63 ] * N
minT = min(T)
start = T.index(minT)
dp[start] = minT
for i in range(1, N):
    pos = (start + i) % N
    dp[pos] = min(dp[pos - 1] + S[pos - 1], T[pos])

for dpi in dp:
    print(dpi)
