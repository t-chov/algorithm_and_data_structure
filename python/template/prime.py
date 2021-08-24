from math import sqrt


def prime_sieve(n: int):
    """エラトステネスのふるい"""
    is_prime = [True] * (n + 1)
    for i in range(2, n + 1):
        if not is_prime[i]: continue
        for j in range(i * 2, n + 1, i):
            is_prime[j] = False
    return is_prime


def prime_factorize(n: int):
    """素因数分解"""
    s = int(sqrt(n)) + 1
    r = 0
    primes = []
    for i in range(2, s):
        if n % i == 0:
            r = 0
            while n % i == 0:
                r += 1
                n /= i
            primes.append((i, r))
    if n > s:
        primes.append((n, 1))
    return primes
