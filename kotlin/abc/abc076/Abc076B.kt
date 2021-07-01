package abc.abc076

fun main() {
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    var num = 1
    for (i in 1..n) {
        val a = num * 2
        val b = num + k
        num = minOf(a, b)
    }
    println(num)
}