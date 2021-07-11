package abc.to75.abc072

fun main() {
    val n = readLine()!!.toInt()
    val p = readLine()!!.split(" ").map(String::toInt).toIntArray()
    var i = 0
    var ops = 0
    while (i < n - 1) {
        if (p[i] == i + 1) {
            val tmp = p[i]
            p[i] = p[i + 1]
            p[i + 1] = tmp
            ops++
        }
        i++
    }
    if (p.last() == n) ops++
    println(ops)
}