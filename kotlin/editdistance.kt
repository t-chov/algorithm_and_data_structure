import kotlin.math.min

/**
 * dp[i][j]
 * Sの最初のi文字分と，Tの最初のj文字分との間の編集距離
 */
fun main() {
    val MAX = 2 shl 20
    val S = "logistic"
    val T = "algorithm"

    val dp = Array(S.length + 1) {
        Array(T.length + 1) { MAX }
    }
    dp[0][0] = 0
    for (i in 0..S.length) {
        for (j in 0..T.length) {
            if (i > 0 && j > 0) {
                if (S.get(i - 1) == T.get(j - 1)) {
                    // 同じ文字なので、前の編集距離を伝播させる
                    dp[i][j] = min(
                            dp[i][j],
                            dp[i-1][j-1]
                    )
                } else {
                    // 違う文字なので、インクリメント
                    dp[i][j] = min(
                            dp[i][j],
                            dp[i-1][j-1] + 1
                    )
                }
            }

            // 削除
            if (i > 0) {
                dp[i][j] = min(
                        dp[i][j],
                        dp[i-1][j] + 1
                )
            }

            // 挿入
            if (j > 0) {
                dp[i][j] = min(
                        dp[i][j],
                        dp[i][j-1] + 1
                )
            }
        }
    }

    println(dp.last().last())
}