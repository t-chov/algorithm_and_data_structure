import sys

if __name__ == '__main__':
    min = 20
    max = 36
    median = int((min + max) / 2)

    is_answer = False
    current = median
    while not is_answer:
        print(f'upper or lower than {current} or equal? (u/l/e)')
        flag = sys.stdin.readline().strip()
        if flag == 'e':
            print(f'answer is: {current}')
            sys.exit(0)
        elif flag == 'u':
            min = current
            current = int(current + ((max - current) / 2))
        else:
            max = current
            current = int(current - ((current - min) / 2))
