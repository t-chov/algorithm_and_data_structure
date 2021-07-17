package abc.to225.abc210

private fun main() {
    val (N, K) = readLine()!!.split(" ").map(String::toInt)
    val C = readLine()!!.split(" ").map(String::toInt)
    val colors = HashMap<Int, Int>()
    for (i in 0 until K) {
        val ci = C[i]
        colors[ci] = (colors[ci] ?: 0) + 1
    }
    var ans = colors.keys.size
    for (i in K until N) {
        val ci = C[i]
        val prevC = C[i - K]
        if (colors[prevC] ?: 1 == 1) {
            colors.remove(prevC)
        } else {
            colors[prevC] = (colors[prevC] ?: 0) - 1
        }
        colors[ci] = (colors[ci] ?: 0) + 1
        ans = maxOf(ans, colors.keys.size)
    }
    println(ans)
}