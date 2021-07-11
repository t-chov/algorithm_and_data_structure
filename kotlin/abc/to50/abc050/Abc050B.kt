package abc.to50.abc050

fun main() {
    val N = readLine()!!.toInt()
    val T = readLine()!!.split(" ").map(String::toInt)
    val sumT = T.sum()
    val M = readLine()!!.toInt()
    val X = List(M) { readLine()!!.split(" ").map(String::toInt).let { it[0] to it[1] } }

    X.forEach {
        val pi = it.first
        val xi = it.second
        val sum = sumT - T[pi - 1] + xi
        println(sum)
    }
}