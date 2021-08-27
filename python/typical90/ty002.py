n = int(input())

if n % 2 == 0:
    for i in range(2 ** n):
        bitstr = f'{i:0{n}b}'
        diff = 0
        for char in bitstr:
            if char == '0':
                diff += 1
            else:
                diff -= 1
            if diff < 0:
                break
        if diff == 0:
            ans = bitstr.replace('0', '(').replace('1', ')')
            print(ans)

