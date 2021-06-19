package abc.abc061

fun main() {
    val (N, K) = readLine()!!.split(" ").map(String::toLong)
    val ops = List(N.toInt()) {
        readLine()!!.split(" ").map(String::toLong).let { it[0] to it[1] }
    }.sortedBy { it.first }
    var lim = 0L
    ops.forEach { op ->
        val n = op.first
        lim += op.second
        if (K <= lim) {
            println(n)
            return
        }
    }
}