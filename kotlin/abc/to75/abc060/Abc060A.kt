package abc.to75.abc060

fun main() {
    val (a, b, c) = readLine()!!.split(" ")
    if (a.last() == b.first() && b.last() == c.first()) {
        println("YES")
    } else {
        println("NO")
    }
}