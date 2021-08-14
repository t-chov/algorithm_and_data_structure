(s, t) = map(int, input().split())


ans = 0
for a in range(s + 1):
    for b in range(s + 1):
        for c in range(s + 1):
            sum = a + b + c
            mul = a * b * c
            if sum <= s and mul <= t:
                ans += 1

print(ans)
