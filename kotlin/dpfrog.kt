import kotlin.math.abs
import kotlin.math.min

const val INF = 2 shl 32

fun main() {
    val n = 7 // 足場の数
    val h = listOf(2, 9, 4, 5, 1, 6, 10)

    val dp = Array(n) {INF}
    dp[0] = 0

    for (i in 1 until n) {
        if (i == 1) {
            // 0 -> 1 は一通り
            dp[i] = abs(h[i] - h[i - 1])
        } else {
            dp[i] = min(
                    // 1つ飛ばしで来る
                    dp[i - 1] + abs(h[i] - h[i -1]),
                    // 2つ飛ばしで来る
                    dp[i - 2] + abs(h[i] - h[i - 2])
            )
        }
    }

    println(dp[n - 1])

}