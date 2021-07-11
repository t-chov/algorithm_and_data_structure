package abc.to100.abc078

fun main() {
    val (x, y) = readLine()!!.split(" ").map { it[0] }
    when {
        x < y -> println("<")
        x > y -> println(">")
        else -> println("=")
    }
}