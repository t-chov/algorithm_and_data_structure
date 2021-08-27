import bisect

N = int(input())
A = sorted(list(map(int, input().split())))
Q = int(input())
for j in range(Q):
    b = int(input())
    pos = bisect.bisect_left(A, b)
    if pos == 0:
        print(abs(A[0] - b))
    elif pos == N:
        print(abs(A[N - 1] - b))
    else:
        print(min(
            abs(A[pos] - b),
            abs(A[pos - 1] - b)
        ))
