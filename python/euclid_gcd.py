"""
m mod n = r とすると、 GCD(m, n) = GCD(n, r) となる
// m > n とする
"""
import sys


def euclid_gcd(m: int, n: int) -> int:
    """
    r = m % n
    if r == 0:
        return n
    return euclid_gcd(n, r)
    """
    # こうリファクタリングできる
    if n == 0:
        return m
    return euclid_gcd(n, m % n)
    

if __name__ == '__main__':
    m = int(sys.argv[1])
    n = int(sys.argv[2])
    print(euclid_gcd(m, n))
