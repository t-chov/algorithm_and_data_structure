from itertools import permutations

s, k = input().split()
s = sorted(s)
k = int(k)
ss = set()

for si in permutations(s, len(s)):
    ss.add(si)
    if len(ss) == k:
        print(''.join(si))
        break
