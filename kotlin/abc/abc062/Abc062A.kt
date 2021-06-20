package abc.abc062

fun main() {
    val (x, y) = readLine()!!.split(" ").map(String::toInt)
    val gA = setOf(1, 3, 5, 7, 8, 10, 12)
    val gB = setOf(4, 6, 9, 11)
    val gC = setOf(2)
    if (x in gA) {
        if (y in gA) println("Yes") else println("No")
        return
    }
    if (x in gB) {
        if (y in gB) println("Yes") else println("No")
        return
    }
    if (x in gC) {
        if (y in gC) println("Yes") else println("No")
        return
    }
}