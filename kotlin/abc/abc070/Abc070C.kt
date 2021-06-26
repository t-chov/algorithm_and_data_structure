package abc.abc070

fun main() {
    val n = readLine()!!.toInt()
    val t = List(n) { readLine()!!.toULong() }
    var lcm = t.first()
    for (i in 1 until n) {
        val gcd = gcd(lcm, t[i])
        // 先にGCDで割らないとオーバーフローする
        lcm = lcm / gcd * t[i]
    }
    println(lcm)
}

fun gcd(a: ULong, b: ULong): ULong {
    if (b == 0UL) return a
    return gcd(b, a % b)
}
