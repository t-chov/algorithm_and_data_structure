package abc.to225.abc212

private fun main() {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)
    if (a == 0) println("Silver")
    else if (b == 0) println("Gold")
    else println("Alloy")
}