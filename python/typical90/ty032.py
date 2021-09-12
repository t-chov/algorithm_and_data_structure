from itertools import permutations

N = int(input())
A = [list(map(int, input().split())) for _ in range(N)]
M = int(input())

rule = [[True for _ in range(N)] for _ in range(N)]
for _ in range(M):
    x, y = map(lambda x: int(x) - 1, input().split())
    rule[x][y] = False
    rule[y][x] = False

ans = 2 ** 32
for order in permutations(list(range(N)), N):
    is_ok = True
    for i in range(N - 1):
        cur = order[i]
        next = order[i + 1]
        is_ok = is_ok and rule[cur][next]

    if is_ok:
        ans = min(ans, sum(A[i][j] for j, i in enumerate(order)))

if ans == 2 ** 32:
    ans = -1

print(ans)
