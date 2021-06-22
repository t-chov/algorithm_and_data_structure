package abc.abc066

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map(String::toLong)
    if (n == 1) {
        println(a.joinToString(" "))
        return
    }
    val X = Array(n) { 0L }
    if (n % 2 == 1) {
        for (i in 0 until n) {
            val delta = if (i % 2 == 0) {
                -i / 2
            } else {
                (i + 1) / 2
            }
            X[(n - 1)/2 + delta] = a[i]
        }
        println(X.joinToString(" "))
        return
    }
    for (i in 0 until n) {
        val delta = if (i % 2 == 0) {
            i / 2
        } else {
            -1 * (i + 1) / 2
        }
        X[n/2 + delta] = a[i]
    }
    println(X.joinToString(" "))
    return
}