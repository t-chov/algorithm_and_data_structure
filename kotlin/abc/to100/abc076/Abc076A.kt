package abc.to100.abc076

fun main() {
    val r = readLine()!!.toDouble()
    val g = readLine()!!.toDouble()
    // (r + next) / 2 = g
    // r + next = 2g
    // next = 2g - r
    val next = 2 * g - r
    if (next % 1.0 == 0.0) {
        println(next.toInt())
    } else {
        println(next)
    }
}