/**
 * https://atcoder.jp/contests/dp/tasks/dp_a
 */
import kotlin.math.abs
import kotlin.math.min


fun main() {
    val COST_MAX = 1 shl 16
    val N = readLine()!!.toInt()
    val heights = readLine()!!.split(" ").map { it.toInt() }
    val dp = Array(N) { COST_MAX }
    dp[0] = 0
    heights.forEachIndexed { index, height ->
        dp[index] = when(index) {
            0 -> 0
            1 -> abs(heights[index] - heights[index - 1])
            else -> min(
                    dp[index - 1] + abs(height - heights[index - 1]),
                    dp[index - 2] + abs( height - heights[index - 2])
            )
        }
    }
    println(dp.last())
}