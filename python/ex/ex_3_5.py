"""
3.5
N(2)個の相異なる整数a0,a1,...,aN－1が与えられます．このうち２番目に小さい値を求めるO(N)のアルゴリズムを設計してください．（難易度★★☆☆☆）
"""
import sys
from math import log2

numbers = [int(x) for x in sys.stdin.readlines()]

min_2n = 2 ** 31
for n in numbers:
    log2n = log2(n)
    if float.is_integer(log2n):
        min_2n = min(int(log2n), min_2n)

print(min_2n)
