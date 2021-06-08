package abc.abc077

fun main() {
    val n = readLine()!!.toLong()
    val A = readLine()!!.split(" ").map(String::toLong).sorted()
    val B = readLine()!!.split(" ").map(String::toLong).sorted()
    val C = readLine()!!.split(" ").map(String::toLong).sorted()

    var ans = 0L
    B.forEach { b ->
        val ac = A.lowerBound(b).toLong()
        val cc = n - C.upperBound(b).toLong()
        ans += maxOf(ac, 0L) * maxOf(cc, 0L)
    }
    println(ans)
}

fun <E : Comparable<E>> List<E>.lowerBound(v: E): Int {
    val res = binarySearch(v, Comparator { o1, o2 -> if (o1 >= o2) 1 else -1 })
    return if (res >= 0) res else res.inv()
}

fun <E : Comparable<E>> List<E>.upperBound(v: E): Int {
    val res = binarySearch(v, Comparator { o1, o2 -> if (o1 > o2) 1 else -1 })
    return if (res >= 0) res else res.inv()
}