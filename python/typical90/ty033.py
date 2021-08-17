H, W = map(int, input().split())

if H > 1 and W > 1:
    row = W // 2 + W % 2
    h = (H + 1) // 2

    print(row * h)
else:
    print(H * W)
