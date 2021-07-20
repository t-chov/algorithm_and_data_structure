package abc.to225.abc203

private fun main() {
    val (N, K) = readLine()!!.split(" ").map(String::toInt)
    val abs = List(N) {
        readLine()!!.split(" ").map(String::toLong).let {
            it[0] to it[1]
        }
    }.sortedBy { it.first }
    var money = K.toLong()
    var pos = 0L
    for (ab in abs) {
        val ai = ab.first
        val bi = ab.second
        if (pos + money < ai) break
        if (ai < pos) {
            money += bi
        } else {
            pos += money + bi
            money = 0L
        }
        // println("$pos $money")
    }
    pos += money
    println(pos)
}