package abc.abc054

fun main() {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)
    if (a == b) {
        println("Draw")
    } else if (a == 1) {
        println("Alice")
    } else if (b == 1) {
        println("Bob")
    } else if (a > b) {
        println("Alice")
    } else if (b > a) {
        println("Bob")
    }
}