// https://atcoder.jp/contests/abc040/tasks/abc040_c
import kotlin.math.abs

fun main() {
    val maxCost = 1 shl 24
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map(String::toInt)

    val dp = Array(N){ maxCost }
    dp[0] = 0
    dp[1] = abs(A[1] - A[0])

    (2 until N).forEach { i ->
        dp[i] = minOf(
                dp[i - 1] + abs(A[i] - A[i-1]),
                dp[i - 2] + abs(A[i] - A[i-2])
        )
    }

    println(dp.last())
}