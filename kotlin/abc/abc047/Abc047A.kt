package abc.abc047

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map(String::toLong)
    val sum = a + b + c
    val nokori = sum - maxOf(a, b, c)
    if (nokori == maxOf(a, b, c)) println("Yes") else println("No")
}