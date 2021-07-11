package abc.to100.abc078

fun main() {
    val (x, y, z) = readLine()!!.split(" ").map(String::toInt)
    println((x - z) / (y + z))
}