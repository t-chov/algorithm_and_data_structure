package abc.abc050


fun main() {
    val N = readLine()!!.toInt()
    val sortedA = readLine()!!.split(" ").map(String::toInt).sorted()
    val mod = 1000_000_007L
    if (N % 2 == 1) {
        // 奇数人のとき
        // 0, 2, 2, 4, 4... とならなければいけない
        var valid = sortedA.first() == 0
        for (i in 2..N step 2) {
            valid = valid && sortedA[i - 1] == i && sortedA[i] == i
        }
        if (valid) {
            val p = (N - 1) / 2
            println(modPow(2L, p.toLong(), mod))
        } else {
            println(0)
        }
    } else {
        // 偶数人のときは, 1, 1, 3, 3 ... とならなければいけない
        var valid = true
        for (i in 1..N step 2) {
            valid = valid && sortedA[i - 1] == i && sortedA[i] == i
        }
        if (valid) {
            val p = N / 2
            println(modPow(2L, p.toLong(), mod))
        } else {
            println(0)
        }
    }
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
