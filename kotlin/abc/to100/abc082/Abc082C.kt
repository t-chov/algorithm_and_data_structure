package abc.to100.abc082

fun main() {
    val n = readLine()!!.toInt()
    val a = HashMap<Int, Int>()
    readLine()!!.split(" ").forEach { ais ->
        val ai = ais.toInt()
        a[ai] = (a[ai] ?: 0) + 1
    }
    var ans = 0L
    a.forEach { i, cnt ->
        if (cnt < i) ans += cnt
        else ans += cnt - i
    }
    println(ans)
}