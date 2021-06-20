package abc.abc063

fun main() {
    val N = readLine()!!.toInt()
    val s = List(N) { readLine()!!.toInt() }.sorted()
    val sum = s.sum()
    if (sum % 10 != 0) {
        println(sum)
        return
    }
    for (p in s) {
        if (p % 10 != 0) {
            println(sum - p)
            return
        }
    }
    println(0)
}