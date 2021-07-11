package abc.to50.abc045

import kotlin.math.pow

fun main() {
    val str = readLine()!!
    val bitLength = str.length - 1
    val fullBit = (2.0.pow(bitLength) - 1).toInt()

    print((0..fullBit).map { str.splitByBitFlag(it).map(String::toLong).sum() }.sum())
}

// ビットフラグ化
fun Int.toBitFlag(len: Int) = Integer.toBinaryString(this).padStart(
        length = len,
        padChar = '0'
)

// ビットフラグで分割する
fun String.splitByBitFlag(flagNum: Int): List<String> {
    val bitFlag = flagNum.toBitFlag(this.length - 1)
    // 1桁だと XX になってしまうので 1桁は Early return する
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
