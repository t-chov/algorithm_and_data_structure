package abc.abc055

fun main() {
    val mod = 1_000_000_007L
    val n = readLine()!!.toLong()
    var power = 1L
    for (i in 1L..n) {
        power = power * i % mod
    }
    println(power)
}