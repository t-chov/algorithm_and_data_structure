package abc.abc061

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map(String::toInt)
    if (c in a..b) {
        println("Yes")
    } else {
        println("No")
    }
}