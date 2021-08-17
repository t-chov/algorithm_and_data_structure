N = int(input())
S = [input().rstrip() for _ in range(N)]
users = set()
for i in range(N):
    if S[i] in users:
        continue
    users.add(S[i])
    print(i + 1)
