// https://atcoder.jp/contests/dp/tasks/dp_d

fun main() {
    val (N, W) = readLine()!!.split(" ").map(String::toInt)
    // weight to value
    val items = List(N) {
        readLine()!!.split(" ").map(String::toInt).let { it[0] to it[1] }
    }
    val dp = Array(N + 1) { Array<Long>(W + 1) { 0 } }
    for (i in 0 until N) {
        val item = items[i]
        for (w in 0..W) {
            // i 番目の品物を選ぶ
            if (w - item.first >= 0) {
                dp[i + 1][w] = maxOf(
                        dp[i + 1][w],
                        dp[i][w - item.first] + item.second
                )
            }
            // i 番目の品物を選ばない
            dp[i + 1][w] = maxOf(
                    dp[i + 1][w],
                    dp[i][w]
            )
        }
    }
    println(dp.last().last())
}