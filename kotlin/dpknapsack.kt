import kotlin.math.max

/**
 * dp[i][w]←最初のi個の品物{0,1,...,i－1}までの中から
 * 重さがwを超えないように選んだときの，価値の総和の最大値
 */
fun main() {
    // weight, value
    val items = listOf(
            2 to 3,
            1 to 2,
            3 to 6,
            2 to 1,
            1 to 3,
            5 to 85
    )
    val weightMax = items.sumBy { it.first }
    val N = items.size
    // dp[i][W] の配列を0で初期化
    val dp = Array(N + 1) {
        Array(weightMax + 1) { 0 }
    }
    for (i in 0 until N) {
        val item = items[i]
        for (w in 0..weightMax) {
            // i 番目の品物を選ぶ
            if (w - item.first >= 0) {
                dp[i + 1][w] = max(
                        dp[i + 1][w], // 今の DP table にある next item の最大Value
                        dp[i][w - item.first] + item.second
                )
            }
            // 選ばない
            dp[i + 1][w] = max(
                    dp[i + 1][w], // 今の DP table にある Value
                    dp[i][w]
            )
        }
    }
    (0..weightMax).forEach { weight ->
        println("w=${weight}\tmax=${dp.last()[weight]}")
    }
}