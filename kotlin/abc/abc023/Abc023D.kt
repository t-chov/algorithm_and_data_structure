package abc.abc023

fun main() {
    val n = readLine()!!.toInt()
    // h to s
    val pairs = List(n) {
        readLine()!!
                .split(" ")
                .map(String::toInt)
                .let { it[0] to it[1] }
    }

    // N 個の風船全てについてペナルティを x 以下にする
    // 値域は 0 < x < Long.MAX_VALUE
    var left = 0L
    var right = Long.MAX_VALUE // MAX 系は素直に MAX_VALUE 使わないとWAなりがち
    while ((right - left) > 1) {
        val mid = (left + right) / 2

        var ok = true
        val t = List(n) { 0L }.toMutableList() // 割るまでの時間制限
        for (i in 0 until n) {
            if (mid < pairs[i].first) ok = false // 初期値が目標ペナルティを超えていたらアウト
            else t[i] = (mid - pairs[i].first) / pairs[i].second
        }
        t.sort()

        // sec は経過秒数, limit は制限時間
        t.forEachIndexed { sec, limit ->
            if (limit < sec) ok = false
        }

        if (ok) right = mid else left = mid
    }
    println(right)
}