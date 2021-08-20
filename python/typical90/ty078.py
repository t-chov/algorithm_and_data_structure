N, M = map(int, input().split())
graph = { i:[] for i in range(1, N + 1) }
for _ in range(M):
    ai, bi = map(int, input().split())
    if ai < bi:
        graph[bi].append(ai)
    else:
        graph[ai].append(bi)

ans = 0
for i in range(1, N + 1):
    if len(graph[i]) == 1:
        ans += 1

print(ans)
