package abc.to75.abc068

fun main() {
    val (n, m) = readLine()!!.split(" ").map(String::toInt)
    val paths = List(m) { readLine()!!.split(" ").map(String::toInt).let { it[0] to it[1] } }

    val oneToX = paths.filter { it.first == 1 }.map { it.second }.toSet()
    val xToN = paths.filter { it.second == n }.map { it.first }.toSet()

    if (oneToX.intersect(xToN).isNotEmpty()) {
        println("POSSIBLE")
    } else {
        println("IMPOSSIBLE")
    }
}