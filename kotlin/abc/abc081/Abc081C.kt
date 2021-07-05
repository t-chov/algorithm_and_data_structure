package abc.abc081

fun main() {
    val (n, k) = readLine()!!.split(" ").map(String::toInt)
    val balls = HashMap<Int, Int>()
    readLine()!!.split(" ").forEach { ais ->
        val ai = ais.toInt()
        balls[ai] = (balls[ai] ?: 0) + 1
    }

    val initial = balls.keys.size
    if (initial <= k) {
        println(0)
        return
    }
    val ans = balls.toList().sortedBy { it.second }.subList(0, initial - k).sumBy { it.second }
    println(ans)
}