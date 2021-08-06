package abc.to200.abc178

private fun main() {
    val N = readLine()!!.toLong()
    val mod = 100_000_000_7L

    val total = modPow(10L, N, mod)
    val minus = modPow(9L, N, mod)
    val plus = modPow(8L, N, mod)

    // 負数になる場合があるのでmodを足す
    var ans = total - minus - minus + plus
    ans %= mod
    ans = (ans + mod) % mod
    println(ans)
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
