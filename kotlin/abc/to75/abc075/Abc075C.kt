package abc.to75.abc075

private data class UnionFind(
        // 各頂点の親頂点の番号. 自身が親の場合は-1
        private val roots: Array<Int>,
        // 各頂点の属する根付き木の頂点数
        private val sizes: Array<Int>
) {
    fun root(x: Int): Int {
        if (roots[x] != x) roots[x] = root(roots[x])
        return roots[x]
    }

    fun isSame(x: Int, y: Int): Boolean = root(x) == root(y)

    fun unite(x: Int, y: Int): Boolean {
        var rootX = root(x)
        var rootY = root(y)
        // 同じグループの時はなにもしない
        if (rootX == rootY) return false

        // x 側のサイズが小さいとき
        if (sizes[rootX] < sizes[rootY]) {
            roots[rootX] = rootY
            sizes[rootY] += sizes[rootX]
        } else {
            roots[rootY] = rootX
            sizes[rootX] += sizes[rootY]
        }
        return true
    }

    fun size(x: Int): Int = sizes[x]

    companion object {
        fun initialize(n: Int): UnionFind {
            return UnionFind(
                    roots = Array(n) { idx -> idx },
                    sizes = Array(n) { 1 }
            )
        }
    }
}

private fun main() {
    val (n, m) = readLine()!!.split(" ").map(String::toInt)
    val edges = List(m) { readLine()!!.split(" ").map(String::toInt).let { it[0] - 1 to it[1] - 1 } }
    val ans = (0 until m).map { i ->
        val uf = UnionFind.initialize(n)
        (0 until m).forEach { j ->
            if (i != j) uf.unite(edges[j].first, edges[j].second)
        }
        (0 until n).map { uf.root(it) }.toSet().size != 1
    }.count { it }
    println(ans)
}