package abc.to225.abc206

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
    val n = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map(String::toInt)
    val uf = UnionFind.initialize(200002)
    (0 until n/2).forEach { i ->
        uf.unite(A[i], A[n - i - 1])
    }
    val ans = (0 until 200002).map { i ->
        if (uf.root(i) == i) uf.size(i) - 1
        else 0
    }.sum()
    println(ans)
}