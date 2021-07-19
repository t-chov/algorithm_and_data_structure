package abc.to200.abc189

private fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map(String::toInt)
    var ans = 0
    for (i in 0 until N) {
        var x = A[i]
        for (j in i until N) {
            // 全探索するのだから逐次更新でいい
            x = minOf(x, A[j])
            ans = maxOf(ans, x * (j - i + 1))
        }
    }
    println(ans)
}
