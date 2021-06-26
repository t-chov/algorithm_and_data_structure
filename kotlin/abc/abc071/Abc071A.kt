package abc.abc071

import kotlin.math.absoluteValue

fun main() {
    val (x, a, b) = readLine()!!.split(" ").map(String::toInt)
    val x2a = (x - a).absoluteValue
    val x2b = (x - b).absoluteValue
    if (x2a < x2b) println("A")
    else println("B")
}