package abc.to50.abc042
// https://atcoder.jp/contests/abc042/tasks/arc058_b

fun main() {
    // DPだとメモリ足りない
    val mod = 1000000007
    val (H, W, A, B) = readLine()!!.split(" ").map(String::toInt)
    val dp = Array(H) { LongArray(W) { 0 } }
    dp[0][0] = 1
    for (h in 0 until H) {
        for (w in 0 until W) {
            val hCond = h >= (H - A)
            val wCond = w < B
            if (hCond && wCond) {
                dp[h][w] = 0
            } else if (h == 0) {
                dp[h][w] = 1
            } else if (w == 0) {
                dp[h][w] = 1
            } else {
                dp[h][w] = (dp[h - 1][w] + dp[h][w - 1]) % mod
            }
        }
    }
    println(dp[H - 1][W- 1])
}

