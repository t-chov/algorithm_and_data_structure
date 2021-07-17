package abc.to225.abc210

private fun main() {
    val N = readLine()!!.toInt()
    val S = readLine()!!.toCharArray()
    for (i in 0 until N) {
        if (S[i] == '1') {
            val loser = if (i % 2 == 1) "Aoki" else "Takahashi"
            println(loser)
            return
        }
    }
}