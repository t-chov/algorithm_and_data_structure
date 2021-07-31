package abc.to225.abc212

import kotlin.math.absoluteValue

private fun main() {
    val (N, M) = readLine()!!.split(" ").map(String::toInt)
    val A = readLine()!!.split(" ").map(String::toInt).sorted()
    val B = readLine()!!.split(" ").map(String::toInt).sorted()
    var ans = (A[0] - B[0]).absoluteValue
    A.forEach { ai ->
        val bpos = B.lowerBound(ai)
        if (bpos > 0) {
            ans = minOf(ans, (ai - B[bpos - 1]).absoluteValue)
        }
        if (bpos < M - 1) {
            ans = minOf(ans, (ai - B[bpos + 1]).absoluteValue)
        }
        if (bpos != M) ans = minOf(ans, (ai - B[bpos]).absoluteValue)
    }
    println(ans)
}

private fun <E : Comparable<E>> List<E>.lowerBound(v: E): Int {
    val res = binarySearch(v, Comparator { o1, o2 -> if (o1 >= o2) 1 else -1 })
    return if (res >= 0) res else res.inv()
}
