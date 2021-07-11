package abc.to225.abc206

fun main() {
    val n = readLine()!!.toLong()
    val aMap = HashMap<Long, Long>()
    readLine()!!.split(" ").forEach { a ->
        val ai = a.toLong()
        if (aMap.contains(ai)) aMap[ai] = aMap[ai]!! + 1L
        else aMap[ai] = 1
    }
    val nC2 = n * (n - 1L) / 2L
    var ans = nC2
    aMap.forEach { ai, count ->
        // println("$ai, $count")
        val countC2 = count * (count - 1L) / 2L
        ans -= countC2
    }
    println(ans)
}