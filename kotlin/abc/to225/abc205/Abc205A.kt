package abc.to225.abc205

fun main() {
    val (A, B) = readLine()!!.split(" ").map(String::toDouble)
    println(A * B / 100)
}