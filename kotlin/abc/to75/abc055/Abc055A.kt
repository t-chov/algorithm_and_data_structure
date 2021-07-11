package abc.to75.abc055

fun main() {
    val n = readLine()!!.toInt()
    val pay = n * 800
    val given = (n / 15) * 200
    print(pay - given)
}