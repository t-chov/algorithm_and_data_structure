package abc.abc046

import kotlin.math.pow

fun main() {
    val (N, K) = readLine()!!.split(" ").map(String::toLong)
    val ans = K * (K - 1).toDouble().pow((N - 1).toDouble()).toLong()
    println(ans)
}