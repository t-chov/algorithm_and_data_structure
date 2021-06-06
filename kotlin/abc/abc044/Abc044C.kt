package abc.abc044

fun main() {
    val (N, avg) = readLine()!!.split(" ").map(String::toInt)
    val nums = readLine()!!.split(" ").map(String::toInt)
    val lim = nums.max()!! * N

    val dp = Array(N + 1) { Array(N + 1) { LongArray(lim + 1) { 0 } }}
    dp[0][0][0] = 1
    // i 枚目までで
    for (i in 1..N) {
        // j 枚選んで
        dp[i][0][0] = 1 // 合計0は必ずいける
        for (j in 1..N) {
            // 合計が k となる
            for (k in 1..lim) {
                if (k - nums[i - 1] >= 0) {
                    dp[i][j][k] = dp[i - 1][j][k] + dp[i - 1][j - 1][k - nums[i - 1]]
                } else {
                    dp[i][j][k] = dp[i - 1][j][k]
                }
            }
        }
    }

    var ans = 0L
    for (j in 1..N) {
        for (k in 1..lim) {
            if (k == avg * j) {
                ans += dp[N][j][k]
            }
        }
    }
    println(ans)
}