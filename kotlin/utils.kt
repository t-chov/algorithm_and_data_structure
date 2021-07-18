
// ビットフラグ化
private fun Int.toBitFlag(len: Int) = Integer.toBinaryString(this).padStart(
        length = len,
        padChar = '0'
)

// ビットフラグで分割する
private fun String.splitByBitFlag(flagNum: Int): List<String> {
    val bitFlag = flagNum.toBitFlag(this.length - 1)
    // 1桁だと XX になってしまうので 1桁は特殊処理
    if (bitFlag == "0") return listOf(this)

    var s = ""
    val n = mutableListOf("0")
    for (bit in bitFlag.withIndex()) {
        s += this[bit.index]
        if (bit.value == '1') {
            n.add(s)
            s = ""
        }
    }
    s += this.last()
    n.add(s)

    return n
}

/* ビット全探索
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
*/