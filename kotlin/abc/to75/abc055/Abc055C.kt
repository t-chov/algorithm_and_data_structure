package abc.to75.abc055

fun main() {
    // 貪欲法で O(1)
    val (s, c) = readLine()!!.split(" ").map(String::toLong)
    if (s > c / 2L) {
        println(c / 2L)
        return
    }
    println(s + (c - s * 2L) / 4L)
}