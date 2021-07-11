package abc.to225.abc206

fun main() {
    val n = readLine()!!.toLong()
    var sum = 0L
    for (i in 1L..n) {
        sum += i
        if (sum >= n) {
            println(i)
            return
        }
    }
}