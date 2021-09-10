import math


def pos(L: int, T: int, e: int):
    t = (2 * math.pi) * (e / T)
    return (0, -1 * (L / 2) * math.sin(t), L / 2 - (L / 2) * math.cos(t))


T = int(input())
L, X, Y = map(int, input().split())
Q = int(input())

for _ in range(Q):
    e = int(input())
    p = pos(L, T, e)
    op = p[2]
    ox = math.sqrt((Y - p[1]) ** 2 + X ** 2)
    theta = math.atan(op / ox)
    print((theta / math.pi) * 180)

