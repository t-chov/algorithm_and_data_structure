package abc.to75.abc053

fun main() {
    val x = readLine()!!.toLong()
    if (x % 11 == 0L) {
        println((x / 11L) * 2L)
    } else if (x % 11 > 6) {
        println((x / 11L) * 2L + 2)
    } else {
        println((x / 11L) * 2L + 1)
    }
}