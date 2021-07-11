package abc.abc209

fun main() {
    val (N, X) = readLine()!!.split(" ").map(String::toInt)
    val A = readLine()!!.split(" ").map(String::toInt)
    val sum = A.mapIndexed { index, ai ->
        ai - (index % 2)
    }.sum()
    if (sum <= X) println("Yes")
    else println("No")
}