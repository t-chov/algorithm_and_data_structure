private class UnionFind(
        // 各頂点の親頂点の番号.
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
        val rootX = root(x)
        val rootY = root(y)
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
    val uf = UnionFind.initialize(7)
    println(uf.isSame(1, 2))
    uf.unite(1, 2)
    uf.unite(2, 3)
    uf.unite(5, 6)
    println(uf.isSame(1, 3))
    println(uf.isSame(2, 5))
    uf.unite(1, 6)
    println(uf.isSame(2, 5))
}