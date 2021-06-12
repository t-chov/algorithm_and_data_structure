package abc.abc050

fun main() {
    val (a, op, b) = readLine()!!.split(" ")
    if (op == "+") {
        println(a.toLong() + b.toLong())
    } else {
        println(a.toLong() - b.toLong())
    }
}