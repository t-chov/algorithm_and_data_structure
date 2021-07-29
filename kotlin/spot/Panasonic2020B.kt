package spot

private fun main() {
    val (h, w) = readLine()!!.split(" ").map(String::toLong)
    if (h == 1L || w == 1L) {
        println(1)
        return
    }
    val odd = if (w % 2L == 0L) w / 2L else (w + 1) / 2L
    val even = if (w % 2L == 0L) w / 2L else (w - 1) / 2L
    val ans = if (h % 2L == 0L) {
        (odd + even) * (h / 2L)
    } else {
        (odd + even) * (h / 2L) + odd
    }
    println(ans)
}