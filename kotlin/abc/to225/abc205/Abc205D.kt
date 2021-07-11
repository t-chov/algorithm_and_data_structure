package abc.to225.abc205

fun main() {
    val (N, Q) = readLine()!!.split(" ").map(String::toInt)
    val A = readLine()!!.split(" ").map(String::toLong)
    val queries = List(Q) { readLine()!!.toLong() }
    // この区間までに何個数値があるか
    val ranges = Array(N) { A[0] - 1L }
    (1 until N).forEach { i ->
        ranges[i] = ranges[i - 1] + A[i] - A[i - 1] - 1L
    }
    val rangesList = ranges.toList()
    // println(ranges.joinToString())
    queries.forEach { q ->
        val pos = rangesList.lowerBound(q)
        if (pos == 0) {
            println(q)
            return@forEach
        }
        if (pos >= N) {
            println(A.last() + (q - ranges.last()))
            return@forEach
        }
        val ans = A[pos - 1] + q - rangesList[pos - 1]
        println(ans)
    }
}

fun <E : Comparable<E>> List<E>.lowerBound(v: E): Int {
    val res = binarySearch(v, Comparator { o1, o2 -> if (o1 >= o2) 1 else -1 })
    return if (res >= 0) res else res.inv()
}
