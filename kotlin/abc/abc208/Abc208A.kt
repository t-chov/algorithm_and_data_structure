package abc.abc208

fun main() {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)
    if (b <= a * 6 && a <= b) {
        println("Yes")
    } else {
        println("No")
    }
}