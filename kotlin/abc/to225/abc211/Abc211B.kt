package abc.to225.abc211

private fun main() {
    val ch = setOf("H", "2B", "3B", "HR")
    val result = List(4) { readLine()!! }.toSet()
    if (ch == result) println("Yes")
    else println("No")
}