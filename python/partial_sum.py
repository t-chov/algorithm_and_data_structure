"""
N個の正の整数a0,a1,...,aN－1と正の整数Wが与えられます．
a0,a1,...,aN－1の中から何個かの整数を選んで総和をWとすることができるかどうかを判定してください．

# 想定として、Wが最初に渡ってきてあとはa0, a1… とする
"""
import sys


def partial_sum(numbers, expect_sum):
    if expect_sum == 0 and len(numbers) == 0:
        return True
    if len(numbers) == 0:
        return False

    lastnum = numbers[-1]
    return partial_sum(numbers[:-1], expect_sum - lastnum) or partial_sum(numbers[:-1], expect_sum)


if __name__ == '__main__':
    numbers = [int(x.strip()) for x in sys.stdin.readlines()]

    W = numbers[0]
    A = numbers[1:]
    print(partial_sum(A, W))
