package abc.to200.abc199

private fun main() {
    val N = readLine()!!.toInt()
    var S = readLine()!!.toCharArray()
    val Q = readLine()!!.toInt()
    var flipped = false
    (1..Q).forEach {
        val (t, a, b) = readLine()!!.split(" ").map(String::toInt)
        if (t == 1) {
            val ai = if (flipped) {
                (a + N - 1) % (2 * N)
            } else {
                a - 1
            }
            val bi = if (flipped) {
                (b + N - 1) % (2 * N)
            } else {
                b - 1
            }
            val tmp = S[ai]
            S[ai] = S[bi]
            S[bi] = tmp
        } else {
            flipped = !flipped
        }
    }
    val ans = if (flipped) {
        S.takeLast(N) + S.take(N)
    } else S.toList()
    println(ans.joinToString(""))
}