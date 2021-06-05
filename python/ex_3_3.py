"""
3.3
N(>=2)個の相異なる整数a0,a1,...,aN－1が与えられます．このうち２番目に小さい値を求めるO(N)のアルゴリズムを設計してください．（難易度★★☆☆☆）
"""
import sys

min_value = 2 ** 31
second_min_value = 2 ** 31 + 1

numbers = [int(x) for x in sys.stdin.readlines()]

for n in numbers:
    if n < min_value:
        second_min_value = min_value
        min_value = n
    elif n < second_min_value:
        second_min_value = n

print(second_min_value)

