N = int(input())
scores = [[]] * (N + 1)
scores[0] = [0, 0]
cur = (1, 1)
for n in range(1, N + 1):
    ci, pi = map(int, input().split())
    scores[n] = [0, 0]
    if ci == 1:
        scores[n][0] = scores[n - 1][0] + pi
        scores[n][1] = scores[n - 1][1]
    else:
        scores[n][0] = scores[n - 1][0]
        scores[n][1] = scores[n - 1][1] + pi

Q = int(input())
for i in range(Q):
    li, ri = map(int, input().split())
    ichi = scores[ri][0] - scores[li - 1][0]
    ni = scores[ri][1] - scores[li - 1][1]
    print(ichi, ni)
