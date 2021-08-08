package abc.to225.abc213

private fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map(String::toInt)
    val boobieNum = A.sorted()[N - 2]
    val ans = A.indexOf(boobieNum) + 1
    println(ans)
}