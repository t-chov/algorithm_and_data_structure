package abc.to75.abc056

import kotlin.math.absoluteValue

fun main() {
    val (w, a, b) = readLine()!!.split(" ").map(String::toInt)
    if ((a - b).absoluteValue < w) {
        println(0)
        return
    }
    if (a < b) {
        val ans = b - (a + w)
        println(ans)
    } else {
        val ans = a - (b + w)
        println(ans)
    }
}