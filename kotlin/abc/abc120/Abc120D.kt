package abc.abc120

import java.io.PrintWriter

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
    val pw = PrintWriter(System.out)
    val (n, m) = readLine()!!.split(" ").map(String::toInt)
    val uf = UnionFind.initialize(n)
    val edges = List(m) { readLine()!!.split(" ").map(String::toInt).let{ it[0] - 1 to it[1] - 1 }}
    val ans = Array(m) { n.toLong() * (n.toLong() - 1L) / 2L }
    val cnt = Array(n) { 1L }
    for (i in m - 1 downTo 1) {
        val (a, b) = edges[i]
        if (uf.root(a) == uf.root(b)) {
            ans[i - 1] = ans[i]
        } else {
            ans[i - 1] = ans[i] - cnt[uf.root(a)] * cnt[uf.root(b)]
            val sm = cnt[uf.root(a)] + cnt[uf.root(b)]
            uf.unite(a, b)
            cnt[uf.root(a)] = sm
        }
    }
    ans.forEach { a ->
        pw.println(a)
    }
    pw.flush()
}