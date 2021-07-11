package abc.to225.abc208

fun main() {
    val COST_MAX = Long.MAX_VALUE

    val (n, m) = readLine()!!.split(" ").map(String::toInt)
    val graph = Array(n) { HashSet<Edge>() }
    val costTable = Array(n) { Array(n) { Array(n) { COST_MAX } } }

    repeat((1..m).count()) {
        val (a, b, c) = readLine()!!.split(" ").map(String::toInt)
        graph[a - 1].add(Edge(b - 1, c.toLong()))
        (0 until n).forEach {
            costTable[a - 1][b - 1][it] = c.toLong()
        }
    }

    // ダイクストラっぽいけど制約条件がうまく表現できない…
    // ワーシャルフロイド法だった. WA
    for(i in 0 until n) {
        for (k in 0 until n) {
            // i から到達可能な場所 を k 未満の通過で探す
            val used = Array(n) { false }
            val dist = Array(n) { COST_MAX }
            dist[i] = 0
            for (iter in 0 until n) {
                var minDist = COST_MAX
                var minV = -1
                for (v in 0 until n) {
                    if (!used[v] && dist[v] < minDist) {
                        minDist = dist[v]
                        minV = v
                    }
                }

                if (minV == -1 || k < minV) break

                for (edge in graph[minV]) {
                    dist[edge.to] = minOf(
                            dist[edge.to],
                            dist[minV] + edge.w
                    )
                }
                used[minV] = true
            }
            // println("${i+1}, ${k + 1} || ${dist.joinToString(", ")}")
            dist.forEachIndexed { index, cost ->
                costTable[i][index][k] = minOf(
                        cost,
                        costTable[i][index][k]
                )
            }
        }
    }

    val sum = costTable.map { i ->
        i.map { j ->
            j.filter { it < COST_MAX }.sum()
        }.sum()
    }.sum()
    println(sum)
}

data class Edge(val to: Int, val w: Long)