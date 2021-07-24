package abc.to225.abc211

import java.util.ArrayDeque

private fun main() {
    val mod = 100_000_000_7L
    val (N, M) = readLine()!!.split(" ").map(String::toInt)
    val graphArray = Array(N) { HashSet<Int>() }
    (0 until M).forEach {
        val (ai, bi) = readLine()!!.split(" ").map(String::toInt)
        val a = ai - 1
        val b = bi - 1
        graphArray[a].add(b)
        graphArray[b].add(a)
    }
    val graph = graphArray.map { it.toSet() }.toList()

    // bfs
    val n = graph.size
    val dist = Array(n) { -1 } // 全頂点を未訪問に初期化
    val queue = ArrayDeque<Int>(n)

    // 頂点 0 を初期頂点とする
    val cnt = Array(N) { 0L }
    cnt[0] = 1L
    dist[0] = 0
    queue.offer(0)

    // キューが空になるまで探索する
    while (queue.isNotEmpty()) {
        val v = queue.poll()
        // v から辿れるところ全て調べる
        for (x in graph[v]) {
            if (dist[x] == -1) {
                // 新たな頂点xについて距離情報を更新する
                dist[x] = dist[v] + 1
                cnt[x] = cnt[v]
                queue.offer(x)
            } else if (dist[x] == dist[v] + 1) {
                cnt[x] += cnt[v]
                cnt[x] %= mod
                continue
            }
        }
    }
    println(cnt[N - 1])
}
