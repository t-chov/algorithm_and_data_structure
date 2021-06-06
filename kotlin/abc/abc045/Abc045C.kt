package abc.abc045

import kotlin.math.pow

fun splitStringByBitstr(orig: String, bitFlag: String): List<String> {
    // 1桁だと XX になってしまうので 1桁は特殊処理
    if (bitFlag == "0") return listOf(orig)

    var s = ""
    val n = mutableListOf("0")
    for (bit in bitFlag.withIndex()) {
        s += orig[bit.index]
        if (bit.value == '1') {
            n.add(s)
            s = ""
        }
    }
    s += orig.last()
    n.add(s)

    return n
}

fun main() {
    val str = readLine()!!
    val bitLength = str.length - 1
    val fullBit = (2.0.pow(bitLength) - 1).toInt()

    var ans = 0L
    for (b in 0..fullBit) {
        val bitstr = Integer.toBinaryString(b).padStart(bitLength, '0')
        ans += splitStringByBitstr(str, bitstr).map(String::toLong).sum()
    }
    print(ans)
}