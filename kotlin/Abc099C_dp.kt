// https://atcoder.jp/contests/abc099/tasks/abc099_c
import kotlin.math.log
import kotlin.math.pow

fun main() {
    val N = readLine()!!.toInt()
    val costMax = 1 shl 28
    val dp = Array(N + 1) { costMax }
    dp[0] = 0
    val maxN = 100000
    val sixMax = log(maxN.toDouble(), 6.0).toInt()
    val nineMax = log(maxN.toDouble(), 9.0).toInt()
    for (i in 1..N) {
        val takeOne = dp[i - 1]
        val takeSix = (1..sixMax).map {
            val offset = 6.0.pow(it.toDouble()).toInt()
            if (i - offset >= 0) dp[i - offset] else costMax
        }
        val takeNine = (1..nineMax).map {
            val offset = 9.0.pow(it.toDouble()).toInt()
            if (i - offset >= 0) dp[i - offset] else costMax
        }
        dp[i] = (listOf(takeOne) + takeSix + takeNine).min()!! + 1
    }

    println(dp.last())
}