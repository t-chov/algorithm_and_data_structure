from collections import defaultdict
from typing import List


class UnionFind():

    def __init__(self, n: int) -> None:
        self.n = n
        self.parents = [-1] * n
    
    def root(self, x: int) -> int:
        if self.parents[x] < 0:
            return x
        else:
            self.parents[x] = self.root(self.parents[x])
            return self.parents[x]
    
    def unite(self, x: int, y: int) -> None:
        x = self.root(x)
        y = self.root(y)

        if x == y:
            return
        
        if self.parents[x] > self.parents[y]:
            x, y = y, x
        
        self.parents[x] += self.parents[y]
        self.parents[y] = x
    
    def size(self, x: int) -> int:
        return -self.parents[self.find(x)]
    
    def members(self, x: int) -> List[int]:
        root = self.find(x)
        return [i for i in range(self.n) if self.find(i) == root]

    def all_group_members(self):
        """for debug"""
        group_members = defaultdict(list)
        for member in range(self.n):
            group_members[self.root(member)].append(member)
        return group_members

    def __str__(self):
        return '\n'.join(f'{r}: {m}' for r, m in self.all_group_members().items())


(N, M) = map(int, input().split(' '))
uf = UnionFind(N)
for i in range(M):
    (ai, bi) = map(int, input().split(' '))
    uf.unite(ai - 1, bi - 1)

roots = { uf.root(i) for i in range(N) }
print(len(roots) - 1)
