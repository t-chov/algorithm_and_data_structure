// https://atcoder.jp/contests/abc129/tasks/abc129_c

fun main() {
    val mod =1000000007
    val (N, M) = readLine()!!.split(" ").map(String::toInt)
    val A = List(M) { readLine()!!.toInt() }.toHashSet()

    val dp = Array<Long>(N + 1) { 1 }
    dp[1] = if (1 in A) 0 else 1
    for (i in 2..N) {
        when {
            i in A -> dp[i] = 0
            // 1段手前が壊れていたら2段前から来る
            i - 1 in A -> dp[i] = dp[i - 2]
            // 2段手前が壊れていたら1段前から来る
            i - 2 in A -> dp[i] = dp[i - 1]
            // 前の2段が正常だったら足し込む
            else -> dp[i] = (dp[i - 1] + dp[i - 2]) % mod
        }
    }

    println(dp.last())
}