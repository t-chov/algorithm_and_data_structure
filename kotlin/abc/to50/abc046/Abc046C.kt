package abc.to50.abc046

// 貪欲法?
fun main() {
    val N = readLine()!!.toInt()
    val ratios = List(N) { readLine()!!.split(" ").let { it[0].toLong() to it[1].toLong() } }

    var t = 1L
    var a = 1L

    ratios.forEach { ratio ->
        val ti = ratio.first
        val ai = ratio.second
        val v = maxOf(div(t, ti), div(a, ai))
        // println("$ti, $ai, $v")
        t = v * ti
        a = v * ai
    }
    println(t + a)
}

fun div(a: Long, b: Long): Long {
    return a / b + (if (a % b == 0L) 0 else 1)
}