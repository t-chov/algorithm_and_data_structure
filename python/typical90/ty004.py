(H, W) = map(int, input().split())

grid = [[]] * H
rowSum = [0] * H
columnSum = [0] * W
for i in range(H):
    row = list(map(int, input().split()))
    grid[i] = row
    rowSum[i] = sum(row)
    for j in range(W):
        columnSum[j] += row[j]

for h in range(H):
    rs = rowSum[h]
    vs = [
        str(rs + columnSum[w] - grid[h][w]) for w in range(W)
    ]
    print(' '.join(vs))

