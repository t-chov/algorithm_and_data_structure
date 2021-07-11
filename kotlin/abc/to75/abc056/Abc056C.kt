package abc.to75.abc056

fun main() {
    val x = readLine()!!.toLong()
    (1L..x).forEach { n ->
        val sum = n * (n + 1L) / 2L
        if (sum >= x) {
            println(n)
            return
        }
    }
}