"""
N個の正の整数a0,a1,...,aN－1と正の整数Wが与えられます．
a0,a1,...,aN－1の中から何個かの整数を選んで総和をWとすることができるかどうかを判定してください．

# 想定として、Wが最初に渡ってきてあとはa0, a1… とする
"""
import sys
from collections import defaultdict

memo = defaultdict(dict)

def partial_sum(i, numbers, expect_sum):
    if expect_sum == 0 and i == 0:
        return True
    if i == 0:
        return False
    if i in memo and expect_sum in memo[i]:
        return memo[i][expect_sum]
    
    lastnum = numbers[-1]
    if partial_sum(i - 1, numbers[:-1], expect_sum - lastnum):
        memo[i][expect_sum] = True
        return True
    if partial_sum(i - 1, numbers[:-1], expect_sum):
        memo[i][expect_sum] = True
        return True

    memo[i][expect_sum] = False
    return False


if __name__ == '__main__':
    numbers = [int(x.strip()) for x in sys.stdin.readlines()]

    W = numbers[0]
    A = numbers[1:]
    print(partial_sum(len(A), A, W))
