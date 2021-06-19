package abc.abc206

fun main() {
}

// 全探索なのでTLEする
fun naiveSolve() {
    val n = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map(String::toInt).toIntArray()
    var ops = 0
    for (i in 0..(n/2)) {
        val replNum = A[i]
        val tgtNum = A[A.lastIndex - i]
        if (replNum != tgtNum) {
            (i until n - i).forEach { j ->
                A[j] = if (A[j] == tgtNum) replNum else A[j]
            }
            // println("$i $replNum $tgtNum: ${A.joinToString()}")
            ops++
        }
    }
    println(ops)
}