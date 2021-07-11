// https://atcoder.jp/contests/abc042/tasks/abc042_a
package abc.to50.abc042

fun main() {
    val chars = readLine()!!.split(" ")
    if (chars.count { it == "5" } == 2 && chars.count { it == "7"} == 1) {
        println("YES")
    } else {
        println("NO")
    }
}