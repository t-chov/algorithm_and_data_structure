package abc.to150.abc175

import kotlin.math.absoluteValue

private fun main() {
    val (x, k, d) = readLine()!!.split(" ").map(String::toLong)
    val kd = x.absoluteValue / d
    if (k < kd) {
        val mind = x.absoluteValue - (k * d)
        println(mind)
    } else if ((k - kd) % 2L == 0L){
        println((x % d).absoluteValue)
    } else {
        val min = minOf(
                (x % d + d).absoluteValue,
                (x % d - d).absoluteValue
        )
        println(min)
    }
}