package abc.abc069

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map(String::toInt)
    val numOf4 = a.filter { it % 4 == 0 }.count()
    val numOf2 = a.filter { it % 2 == 0 }.count() - numOf4
    val restOf2 = numOf2 % 2
    val odds = n - numOf4 - numOf2
    if (numOf4 + 1 < odds + restOf2) {
        println("No")
        return
    }
    println("Yes")
}