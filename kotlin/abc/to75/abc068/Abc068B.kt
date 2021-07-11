package abc.to75.abc068

fun main() {
    val n = readLine()!!.toInt()
    var max = 1
    while (max <= n / 2) {
        max *= 2
    }
    println(max)
}