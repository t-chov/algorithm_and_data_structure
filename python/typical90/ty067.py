def op(n: str):
    oc = int(n, 8)
    nin = ''
    while oc > 0:
        n = oc % 9
        oc = oc // 9
        nin = str(n) + nin
    if not nin:
        return '0'
    return nin.replace('8', '5')


N, K = input().split()
K = int(K)

ans = N
for _ in range(K):
    ans = op(ans)

print(ans)

