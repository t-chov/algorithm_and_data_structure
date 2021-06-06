import java.io.PrintWriter

// println は遅いので TLE 防止のために
val pw = PrintWriter(System.out)

// input
fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nectLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun listOfString() = next().split(" ")
fun listOfInt() = listOfString().map(String::toInt)
fun listOfLong() = listOfString().map(String::toLong)
fun listOfDouble() = listOfString().map(String::toDouble)

// ビットフラグ化
fun Int.toBitFlag(len: Int) = Integer.toBinaryString(this).padStart(
        length = len,
        padChar = '0'
)

// ビットフラグで分割する
fun String.splitByBitFlag(flagNum: Int): List<String> {
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
