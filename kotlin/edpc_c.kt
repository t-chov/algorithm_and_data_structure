// https://atcoder.jp/contests/dp/tasks/dp_c

fun main() {
    val N = readLine()!!.toInt()
    val ds = List(N) { readLine()!!.split(" ").map(String::toInt) }
    val dp = Array(N + 1){ Array(3) { 0 } }

    for (i in 0 until N) {
        for (j in 0 until 3) {
            for (k in 0 until 3) {
                if (j == k) continue
                // 「どこにいるか」の遷移をみる
                dp[i + 1][k] = maxOf(
                        dp[i + 1][k],
                        dp[i][j] + ds[i][k]
                )
            }
        }
    }

    println(dp.last().toList().max())
}


