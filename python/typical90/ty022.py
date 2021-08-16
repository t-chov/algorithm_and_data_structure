def gcd(m, n) -> int:
    if n == 0:
        return m
    return gcd(n, m % n)

A, B, C = sorted(map(int, input().split()))

abg = gcd(B, A)
bcg = gcd(C, B)
abc_gcd = gcd(abg, bcg)

ac = (A // abc_gcd) - 1
bc = (B // abc_gcd) - 1
cc = (C // abc_gcd) - 1

print(ac + bc + cc)
