# 単純だが丸め誤差があるのでこの解法である必要がある
a, b, c = map(int, input().split())
if c ** b > a:
    print('Yes')
else:
    print('No')
