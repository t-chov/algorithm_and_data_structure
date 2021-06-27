package abc.abc072

fun main() {
    val (x, t) = readLine()!!.split(" ").map(String::toInt)
    println(maxOf(0, x - t))
}