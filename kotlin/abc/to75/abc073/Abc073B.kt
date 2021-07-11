package abc.to75.abc073

fun main() {
    val n = readLine()!!.toInt()
    val seats = List(n) { readLine()!!.split(" ").map(String::toLong) }
    val ans = seats.map { it[1] - it[0] + 1L }.sum()
    println(ans)
}