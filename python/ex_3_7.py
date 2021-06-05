"""
3.7
各桁の値が１以上９以下の数値のみである整数とみなせるような，長さNの文字列Sが与えられます．
この文字列の中で，文字と文字の間のうちのいくつかの場所に「＋」を入れることができます．
１つも入れなくてもかまいませんが，「＋」が連続してはいけません．
このようにしてできるすべての文字列を数値とみなして，総和を計算するO(2N)のアルゴリズムを設計してください．
たとえばS＝"125"のときは，125,1＋25(＝26),12＋5(＝17),1＋2＋5(＝8)の総和をとって176となります．
"""
import sys

numberstr = sys.stdin.readline().strip()

bitlength = len(numberstr) - 1
ans = 0
for bit in range(len(numberstr) + 1):
    s = ''
    n = []
    for i, bitflag in enumerate(f'{bit:0{bitlength}b}'):
        s += numberstr[i]
        if bitflag == '1':
            n.append(int(s))
            s = ''
    s += numberstr[-1]
    n.append(int(s))
    ans += sum(n)
    n = []

print(ans)
