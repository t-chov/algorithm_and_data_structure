package abc.to50.abc044
// https://atcoder.jp/contests/abc044/tasks/abc044_a

fun main() {
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()
    println((1..n).map { i ->
        if (i <= k) x else y
    }.sum())
}
