
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