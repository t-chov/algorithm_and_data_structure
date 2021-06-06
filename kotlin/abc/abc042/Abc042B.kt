// https://atcoder.jp/contests/abc042/tasks/abc042_b
package abc.abc042

fun main() {
    val (N, L) = readLine()!!.split(" ").map(String::toInt)
    val strings = List(N) { readLine()!! }
    println(strings.sorted().joinToString(separator = ""))
}