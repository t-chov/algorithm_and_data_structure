package abc.to100.abc079

fun main() {
    val n = readLine()!!.toInt()
    // 再帰でやるとTLEする
    val lucas = Array(n + 1) { 0L }
    lucas[0] = 2L
    lucas[1] = 1L
    for (i in 2..n) {
        lucas[i] = lucas[i - 1] + lucas[i - 2]
    }
    println(lucas[n])
}
