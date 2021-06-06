package abc.abc204

import java.io.PrintWriter

fun main() {
    // solve here
    val (x, y) = readLine()!!.split(" ").map(String::toInt)
    val hands = setOf(0, 1, 2)
    if (x == y) {
        println(x)
    } else {
        println((hands - setOf(x, y)).min())
    }
}
