package abc.abc048

fun main() {
    val (N, x) = readLine()!!.split(" ").map(String::toLong)
    val A = readLine()!!.split(" ").map(String::toLong).toMutableList()

    var n = 0L
    if (A[0] > x) {
        val diff = A[0] - x
        n += diff
        A[0] = x
    }
    for (i in 1 until N.toInt()) {
        val sum = A[i - 1] + A[i]
        if (sum > x) {
            val diff = sum - x
            n += diff
            A[i] = A[i] - diff
        }
    }
    println(n)
}