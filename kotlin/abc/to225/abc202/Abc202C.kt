package abc.to225.abc202

private fun main() {
    val N = readLine()!!.toInt()
    val A = HashMap<Int, Long>()
    readLine()!!.split(" ").map(String::toInt).forEach {
        A[it] = (A[it] ?: 0L) + 1L
    }
    val B = readLine()!!.split(" ").map(String::toInt)
    val C = readLine()!!.split(" ").map(String::toInt)
    var ans = 0L
    for (ci in C) {
        val bci = B[ci - 1]
        ans += A[bci] ?: 0L
    }
    println(ans)
}