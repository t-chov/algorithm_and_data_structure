package abc.to200.abc190

import kotlin.math.pow

private fun main() {
    val (N, M) = readLine()!!.split(" ").map(String::toInt)
    val conds = List(M) {
        readLine()!!.split(" ").map(String::toInt).let{ it[0] to it[1] }
    }

    val K = readLine()!!.toInt()
    val ops = List(K) {
        readLine()!!.split(" ").map(String::toInt).let { it[0] to it[1] }
    }

    var ans = 0
    for (i in 0 until 2.0.pow(K).toInt()) {
        val bitRepl = Integer.toBinaryString(i).padStart(
                length = K,
                padChar = '0'
        )
        // println(bitRepl)
        val balls = HashSet<Int>()
        bitRepl.forEachIndexed { idx, b ->
            if (b == '1') balls.add(ops[idx].first)
            else balls.add(ops[idx].second)
        }
        val ai = conds.filter {
            it.first in balls && it.second in balls
        }.size
        ans = maxOf(ans, ai)
    }
    println(ans)
}
