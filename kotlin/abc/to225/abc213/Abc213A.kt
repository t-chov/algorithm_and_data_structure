package abc.to225.abc213

private fun main() {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)
    for (i in 0 until 256) {
        if (a xor i == b) {
            println(i)
            return
        }
    }
}