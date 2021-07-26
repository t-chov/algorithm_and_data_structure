package abc.to225.abc211

private fun main() {
    val mod = 100_000_000_7L
    val S = readLine()!!.toCharArray()
    val CHOKUDAI = "chokudai".toCharArray()
    val dp = Array(CHOKUDAI.size + 1) { Array(S.size + 1) { 0L } }

    for (x in 0 until S.size) {
        dp[0][x] = 1L
    }
    for (i in 1..CHOKUDAI.size) {
        for (j in 1..S.size) {
            dp[i][j] = if (CHOKUDAI[i - 1] == S[j - 1]) {
                (dp[i - 1][j - 1] + dp[i][j - 1]) % mod
            } else {
                dp[i][j - 1]
            }
        }
    }
    println(dp[CHOKUDAI.size][S.size])
}