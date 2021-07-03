import sys
from itertools import product

s = sys.stdin.readline().strip()
nums = [int(c) for c in s]

for ops in product('+-', repeat=3):
    sum = nums[0]
    for i, op in enumerate(ops):
        if op == '+':
            sum += nums[i + 1]
        else:
            sum -= nums[i + 1]
    if sum == 7:
        for i in range(3):
            print(f'{nums[i]}{ops[i]}', end='')
        print(f'{nums[3]}=7')
        break
