package abc.abc060

fun main() {
    val (N, T) = readLine()!!.split(" ").map(String::toLong)
    val tList = readLine()!!.split(" ").map(String::toLong)
    var sum = 0L
    for (i in 0 until N - 1L) {
        val ii = i.toInt()
        sum += minOf(T, tList[ii + 1] - tList[ii])
    }
    println(sum + T)
}