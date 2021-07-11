package abc.to75.abc065

import kotlin.math.absoluteValue

fun main() {
    val (N, M) = readLine()!!.split(" ").map(String::toLong)
    val mod = 1_000_000_007L
    if ((N - M).absoluteValue > 1L) {
        println(0)
        return
    }
    var n = N
    for (i in 1L until n) {
        n = (n * (N - i)) % mod
    }

    var m = M
    for (i in 1L until m) {
        m = (m * (M - i)) % mod
    }

    // println("$n $m")
    if (N == M) {
        println((n * m * 2) % mod)
        return
    }
    println((n * m) % mod)
}