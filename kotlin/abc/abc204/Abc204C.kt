package abc.abc204

fun main() {
    val (N, M) = readLine()!!.split(" ").map(String::toInt)
    val paths = Array(N) { hashSetOf<Int>() }
    (0 until M).forEach { m ->
        val (am, bm) = readLine()!!.split(" ").map(String::toInt)
        paths[am - 1].add(bm - 1)
    }
    // 到着可能かどうか
    val reachable = Array(N) { Array(N) { false } }
    fun dfs(s: Int, i: Int) {
        if (reachable[s][i]) return
        reachable[s][i] = true
        paths[i].forEach { dfs(s, it) }
    }

    (0 until N).forEach { dfs(it, it) }

    println(reachable.sumBy { it.count { it } })
}
