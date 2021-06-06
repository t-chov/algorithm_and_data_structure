// https://atcoder.jp/contests/abc042/tasks/arc058_a
package abc.abc042

fun main() {
    val (N, K) = readLine()!!.split(" ").map(String::toInt)
    val D = readLine()!!.split(" ").toHashSet()

    var offset = 0
    while (true) {
        val testN = N + offset++
        val charsN = testN.toString().toCharArray().map(Char::toString).toHashSet()
        if (charsN.intersect(D).isEmpty()) {
            println(testN)
            break
        }
    }
}