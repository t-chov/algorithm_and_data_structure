package abc.abc205

fun main() {
    val (A, B) = readLine()!!.split(" ").map(String::toDouble)
    println(A * B / 100)
}