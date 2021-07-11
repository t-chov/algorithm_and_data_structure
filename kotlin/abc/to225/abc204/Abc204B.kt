package abc.to225.abc204

fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map(String::toInt)

    println(A.sumBy { maxOf(0, it - 10) })
}
