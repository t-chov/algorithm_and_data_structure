package abc.abc204

// DFS, BFS を勉強する

fun reachable(paths: HashMap<Int, MutableSet<Int>>, start: Int, goal: Int, prevStart: Int): Boolean {
    if (start == goal) return true
    val nexts = paths[start] ?: return false
    if (goal in nexts) return true
    for (via in nexts) {
        // 循環したら打ち切る
        if (prevStart == via) {
            return false
        }
        return reachable(paths, via, goal, start)
    }
    return false
}

fun main() {
    val (N, M) = readLine()!!.split(" ").map(String::toInt)
    // O(M)
    val roads = List(M) {
        val (a, b) = readLine()!!.split(" ").map(String::toInt)
        a to b
    }.sortedBy { it.first }
    // O(M)
    val paths = HashMap<Int, MutableSet<Int>>()
    roads.forEach { road ->
        val src = road.first
        val dst = road.second
        if (!paths.containsKey(src)) {
            paths.set(src, mutableSetOf(src))
        }
        paths[src]!!.add(dst)
    }
    // 孤立リンクの考慮. O(N)
    (1..N).forEach { n ->
        if (!paths.containsKey(n)) {
            paths.set(n, mutableSetOf(n))
        }
    }

    // trips[a][b] = は a to b が可能か
    val trips = Array(N + 1) { Array(N + 1) { false } }
    for (start in 1..N) {
        for (goal in 1..N) {
            trips[start][goal] = reachable(paths, start, goal, start)
            print("${trips[start][goal]} ")
        }
        print("\n")
    }

    println(trips.flatten().filter { it }.size)
}
