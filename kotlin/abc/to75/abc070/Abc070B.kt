package abc.to75.abc070

fun main() {
    val (a, b, c, d) = readLine()!!.split(" ").map(String::toInt)
    val alice = (a..b).toSet()
    val bob = (c..d).toSet()
    println(maxOf(alice.intersect(bob).size - 1, 0))
}