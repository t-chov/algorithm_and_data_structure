package abc.to75.abc057

fun main() {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)
    println((a + b) % 24)
}