package structure

import java.util.ArrayDeque

private fun dfs(graph: List<Set<Int>>, v: Int, seen: Array<Boolean>) {
    seen[v] = true
    // v から行ける各頂点 next_v について
    for (next in graph[v]) {
        if (seen[next]) continue
        dfs(graph, next, seen)
    }
}

private fun bfs(graph: List<Set<Int>>, s: Int): List<Int> {
    val n = graph.size
    val dist = Array(n) { -1 } // 全頂点を未訪問に初期化
    val queue = ArrayDeque<Int>(n)

    // 頂点 s を初期頂点とする
    dist[s] = 0
    queue.offer(s)

    // キューが空になるまで探索する
    while (queue.isNotEmpty()) {
        val v = queue.poll()
        // v から辿れるところ全て調べる
        for (x in graph[v]) {
            if (dist[x] != -1) continue
            // 新たな頂点xについて距離情報を更新する
            dist[x] = dist[v] + 1
            queue.offer(x)
        }
    }
    return dist.toList()
}