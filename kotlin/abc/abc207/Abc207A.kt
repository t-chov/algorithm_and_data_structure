package abc.abc207

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map(String::toInt)
    val ans = a + b + c - minOf(a, b, c)
    println(ans)
}