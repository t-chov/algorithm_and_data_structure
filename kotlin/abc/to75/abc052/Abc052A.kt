package abc.to75.abc052

fun main() {
    val (a, b, c, d) = readLine()!!.split(" ").map(String::toLong)
    if (a * b > c * d) {
        println(a * b)
    } else {
        println(c * d)
    }
}