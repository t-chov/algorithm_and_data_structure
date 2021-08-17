N, P, Q = map(int, input().split())
A = list(map(int, input().split()))

ans = 0
# オーバーフローを防ぐために都度modする
for i in range(N - 4):
    for j in range(i + 1, N - 3):
        ij = A[i] * A[j] % P
        for k in range(j + 1, N - 2):
            ijk = ij * A[k] % P
            for l in range(k + 1, N - 1):
                ijkl = ijk * A[l] % P
                for m in range(l + 1, N):
                    ijklm = ijkl * A[m] % P
                    if ijklm == Q:
                        ans += 1

print(ans)
