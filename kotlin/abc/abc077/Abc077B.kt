package abc.abc077

import kotlin.math.sqrt

fun main() {
    val n = readLine()!!.toLong()

    val rootInt = sqrt(n.toDouble()).toInt()
    print(rootInt * rootInt)
}