package abc.to75.abc065

private fun main() {
    val N = readLine()!!.toInt()
    val A = List(N) { readLine()!!.toInt() - 1 }
    var current = 0
    for (i in 0 until N) {
        current = A[current]
        if (current == 1) {
            println(i + 1)
            return
        }
    }
    println(-1)
}