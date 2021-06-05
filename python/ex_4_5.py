"""
https://atcoder.jp/contests/abc114/tasks/abc114_c
十進法表記で各桁の値が7,5,3のいずれかであり，かつ7,5,3がいずれも一度以上は登場する整数を「753数」とよぶこととします．
正の整数Kが与えられたときに，K以下の753数が何個あるかを求めるアルゴリズムを設計してください．
ただしKの桁数をdとしてO(3^d)程度の計算量を許容できるものとします．
"""
import sys

HAS_3 = 0b001
HAS_5 = 0b010
HAS_7 = 0b100
global CNTR


def enum753(n: int, cur: int, num_flag: int):
    """
    上から辿るのではなく列挙していく
    """
    global CNTR
    if n < cur:
        return
    if num_flag == 0b111:
        CNTR += 1
    # 7を付け加える
    enum753(N, cur * 10 + 7, num_flag | HAS_7)
    # 5を付け加える
    enum753(N, cur * 10 + 5, num_flag | HAS_5)
    # 3を付け加える
    enum753(N, cur * 10 + 3, num_flag | HAS_3)


CNTR = 0
N = int(sys.stdin.readline().strip())
enum753(N, 0, 0)

print(CNTR)
