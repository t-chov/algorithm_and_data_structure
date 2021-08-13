(H, W) = map(int, input().split(' '))

grid = []
grid.append('.' * (W + 2))
for _ in range(H):
    row = '.' + input() + '.'
    grid.append(row)
grid.append('.' * (W + 2))

ans = True
for h in range(1, H + 1):
    for w in range(1, W + 1):
        if grid[h][w] == '#':
            ans = ans and (
                grid[h - 1][w] == '#' or
                grid[h + 1][w] == '#' or
                grid[h][w - 1] == '#' or
                grid[h][w + 1] == '#'
            )

if ans:
    print("Yes")
else:
    print("No")
