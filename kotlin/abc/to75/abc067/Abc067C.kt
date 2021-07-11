package abc.to75.abc067

import kotlin.math.absoluteValue

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map(String::toLong)
    val sum = a.sum()
    var frontSum = a.first()
    var minDiff = (sum - 2L * frontSum).absoluteValue
    for (i in 1 until n - 1) {
        // subList はめちゃくちゃ遅いのでTLEしがち
        frontSum += a[i]
        val diff = (sum - 2L * frontSum).absoluteValue
        minDiff = minOf(minDiff, diff)
    }
    println(minDiff)
}