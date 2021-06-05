// https://atcoder.jp/contests/dp/tasks/dp_b
import java.util.Collections.min
import kotlin.math.abs
// import kotlin.math.min

fun main() {
    val COST_MAX = 1 shl 16
    var N: Int
    var K: Int
    readLine()!!.split(" ").let {
        N = it[0].toInt()
        K = it[1].toInt()
    }
    val h = readLine()!!.split(" ").map { it.toInt() }
    val dp = Array(N) { COST_MAX }

    dp[0] = 0
    for (i in 0 until N) {
        // i - j(j<=K) のパスのうち、最小コストのものをとる
        // 遅いのでなんとかしたい
        dp[i] = min((1..K).filter { i - it >= 0}.map{ j ->
            dp[i - j] + abs(h[i] - h[i - j])
        })
        // 配るDPで書く
        /* WA になる理由がわからん
        for (j in 1..minOf(K, N - i - 1)) {
            dp[i + j] = min(
                    dp[i + j],
                    dp[i] + abs(h[i + j] - h[i])
            )
        }
        */
    }

    println(dp.last())
}