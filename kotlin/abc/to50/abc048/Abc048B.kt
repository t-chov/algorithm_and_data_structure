package abc.to50.abc048

fun main() {
    val (a, b, x) = readLine()!!.split(" ").map(String::toLong)
    val fb = b / x + 1
    val fa = if (a > 0) (a - 1) / x + 1 else 0
    println(fb - fa)
}