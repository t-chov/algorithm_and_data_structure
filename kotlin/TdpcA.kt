// https://atcoder.jp/contests/tdpc/tasks/tdpc_contest

fun main() {
    val N = readLine()!!.toInt()
    val points = readLine()!!.split(" ").map(String::toInt)
    val pMax = points.sum()
    val dp = Array(N + 1) { Array(pMax + 1) { false } }
    dp[0][0] = true
    for (i in 1..N) {
        for (p in 0..pMax) {
            if (p == 0) {
                dp[i][p] = true
            } else if (p >= points[i - 1]){
                dp[i][p] = dp[i - 1][p] || dp[i - 1][p - points[i - 1]]
            } else {
                dp[i][p] = dp[i - 1][p]
            }
        }
    }
    val dpPoints = Array(pMax + 1) { false }
    dp.forEach { flags ->
        flags.forEachIndexed { index, flag ->
            if (flag) {
                dpPoints[index] = true
            }
        }
    }
    println(dpPoints.count { it })
}