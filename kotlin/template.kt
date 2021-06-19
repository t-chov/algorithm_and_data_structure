import java.io.PrintWriter

fun main() {
    // println は遅いので TLE 防止のために
    val pw = PrintWriter(System.out)
    // solve here

    pw.flush()
}

// input
fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nectLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun listOfString() = next().split(" ")
fun listOfInt() = listOfString().map(String::toInt)
fun listOfLong() = listOfString().map(String::toLong)
fun listOfDouble() = listOfString().map(String::toDouble)

// ビットフラグ化
fun Int.toBitFlag(len: Int) = Integer.toBinaryString(this).padStart(
        length = len,
        padChar = '0'
)

// ビットフラグで分割する
fun String.splitByBitFlag(flagNum: Int): List<String> {
    val bitFlag = flagNum.toBitFlag(this.length - 1)
    // 1桁だと XX になってしまうので 1桁は特殊処理
    if (bitFlag == "0") return listOf(this)

    var s = ""
    val n = mutableListOf("0")
    for (bit in bitFlag.withIndex()) {
        s += this[bit.index]
        if (bit.value == '1') {
            n.add(s)
            s = ""
        }
    }
    s += this.last()
    n.add(s)

    return n
}

fun gcd(a: Long, b: Long): Long {
    if (b == 0L) return a
    return gcd(b, a % b)
}

fun <E : Comparable<E>> List<E>.lowerBound(v: E): Int {
    val res = binarySearch(v, Comparator { o1, o2 -> if (o1 >= o2) 1 else -1 })
    return if (res >= 0) res else res.inv()
}

fun <E : Comparable<E>> List<E>.upperBound(v: E): Int {
    val res = binarySearch(v, Comparator { o1, o2 -> if (o1 > o2) 1 else -1 })
    return if (res >= 0) res else res.inv()
}

fun dfsSearch(paths: List<Set<Int>>, size: Int): Array<Array<Boolean>> {
    // 到着可能かどうか
    val reachable = Array(size) { Array(size) { false } }
    fun dfs(s: Int, i: Int) {
        if (reachable[s][i]) return
        reachable[s][i] = true
        paths[i].forEach { dfs(s, it) }
    }
    return reachable
}

/* long N の m 乗を MOD するやつ */
fun modPow(n: Long, m: Long, MOD: Long = (1L shl 31)): Long {
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