package abc.to225.abc209

import java.io.PrintWriter
import java.util.ArrayDeque

private fun main() {
    val pw = PrintWriter(System.out)
    val (n, q) = readLine()!!.split(" ").map(String::toInt)
    val graph = List(n) { HashSet<Int>() }
    (1 until n).forEach {
        val (ai, bi) = readLine()!!.split(" ").map(String::toInt)
        // 無向グラフなので
        graph[ai - 1].add(bi - 1)
        graph[bi - 1].add(ai - 1)
    }
    val dist = bfs(graph, 0)
    // println(graph.joinToString())
    // println(dist.joinToString())
    (0 until q).forEach {
        val (ci, di) = readLine()!!.split(" ").map(String::toInt)
        // 木は必ず二部グラフになるので、色が異なれば道路上、同じなら街で出会う
        val cc = dist[ci - 1] % 2
        val cd = dist[di - 1] % 2
        if (cc == cd) pw.println("Town")
        else pw.println("Road")
    }

    pw.flush()
}

private fun bfs(graph: List<HashSet<Int>>, s: Int): List<Int> {
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
