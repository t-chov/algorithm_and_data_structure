from math import sqrt


def prime_factorize(n: int):
    """素因数分解"""
    s = int(sqrt(n))
    r = 0
    primes = []
    for i in range(2, s + 1):
        if n % i == 0:
            r = 0
            while n % i == 0:
                r += 1
                n = n // i
            primes.append((i, r))
    if n > s:
        primes.append((n, 1))
    return primes


N, M = map(int, input().split())
k = { i: True for i in range(1, M + 1)}

A = set(map(int, input().split()))

memo = set()
for a in A:
    primes = prime_factorize(a)
    for p in primes:
        pp = p[0]
        if pp in memo: continue
        memo.add(pp)
        for i in range(1, M // pp + 1):
            k[pp * i] = False

ans = [i for i in k.keys() if k[i] == True]
print(len(ans))
for a in ans:
    print(a)
