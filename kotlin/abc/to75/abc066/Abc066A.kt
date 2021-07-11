package abc.to75.abc066

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map(String::toInt)
    val ans = a + b + c - maxOf(a, b, c)
    println(ans)
}