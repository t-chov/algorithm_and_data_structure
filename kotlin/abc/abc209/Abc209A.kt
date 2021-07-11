package abc.abc209

fun main() {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)
    val ans = maxOf((b - a) + 1, 0)
    println(ans)
}