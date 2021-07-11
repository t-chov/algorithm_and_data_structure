package abc.abc209

fun main() {
    val n = readLine()!!.toInt()
    val C = readLine()!!.split(" ").map(String::toLong).sorted()
    var ans = 1L
    val mod = 1_000_000_007L
    C.forEachIndexed { index, ci ->
        if (ci <= index) ans = 0L
        else ans = (ans * (ci - index)) % mod
    }
    println(ans)
}
