package abc.to200.abc197

import kotlin.math.pow

private fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map(String::toInt)
    var ans = Integer.MAX_VALUE

    for (i in 0 until 2.0.pow(N - 1).toInt()) {
        val bitRepl = Integer.toBinaryString(i).padStart(
                length = N,
                padChar = '0'
        )
        // println(bitRepl)
        val sections = Array(N) { emptyList<Int>().toMutableList() }
        var cur = 0
        bitRepl.forEachIndexed { j, b ->
            if (b == '1') cur++
            sections[cur].add(A[j])
        }
        // println(sections.joinToString { it.joinToString("") })
        val sectionsOr = sections.filter { it.isNotEmpty() }
                .map { it.reduce { acc, v -> acc or v }}
        val xorValue = sectionsOr.reduce { acc, v -> acc xor v }
        ans = minOf(ans, xorValue)
    }
    println(ans)
}