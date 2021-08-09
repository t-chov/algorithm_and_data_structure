import sys

sys.setrecursionlimit(300000)

PATH = []

N = int(input())
graph = [[] for i in range(N + 1)]

def dfs(current, pre):
    PATH.append(str(current))
    for next in graph[current]:
        if next != pre:
            dfs(next, current)
            PATH.append(str(current))

for i in range(N - 1):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in range(N + 1):
    graph[i].sort()

dfs(1, -1)
print(" ".join(PATH))
