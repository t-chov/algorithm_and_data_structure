package abc.to200.abc198

import kotlin.math.ceil
import kotlin.math.sqrt

private fun main() {
    val (R, X, Y) = readLine()!!.split(" ").map(String::toDouble)
    val dist = sqrt(X * X + Y * Y)
    val ans = if (dist >= R) {
        ceil(dist / R).toInt()
    } else 2
    println(ans)
}