package abc.abc082

import kotlin.math.ceil

fun main() {
    val (a, b) = readLine()!!.split(" ").map(String::toDouble)
    val ans = ceil((a + b) / 2.0)
    println(ans.toInt())
}