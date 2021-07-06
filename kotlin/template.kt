import java.io.PrintWriter

private fun main() {
    // println は遅いので TLE 防止のために
    val pw = PrintWriter(System.out)
    // solve here

    pw.flush()
}

// input
private fun next() = readLine()!!
private fun nextInt() = next().toInt()
private fun nectLong() = next().toLong()
private fun nextDouble() = next().toDouble()
private fun listOfString() = next().split(" ")
private fun listOfInt() = listOfString().map(String::toInt)
private fun listOfLong() = listOfString().map(String::toLong)
private fun listOfDouble() = listOfString().map(String::toDouble)

private fun gcd(a: Long, b: Long): Long {
    if (b == 0L) return a
    return gcd(b, a % b)
}

private fun <E : Comparable<E>> List<E>.lowerBound(v: E): Int {
    val res = binarySearch(v, Comparator { o1, o2 -> if (o1 >= o2) 1 else -1 })
    return if (res >= 0) res else res.inv()
}

private fun <E : Comparable<E>> List<E>.upperBound(v: E): Int {
    val res = binarySearch(v, Comparator { o1, o2 -> if (o1 > o2) 1 else -1 })
    return if (res >= 0) res else res.inv()
}

/* long N の m 乗を MOD するやつ */
private fun modPow(n: Long, m: Long, MOD: Long = (1L shl 31)): Long {
    var ret = 1L
    var x = (n % MOD)
    if (x < 0) x += MOD
    var k = m
    while (k > 0) {
        if ((k and 1L) == 1L) { ret = (ret * x) % MOD }
        x = (x * x) % MOD
        k = k shr 1
    }
    return ret
}