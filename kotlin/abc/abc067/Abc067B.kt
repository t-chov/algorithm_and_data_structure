package abc.abc067

fun main() {
    val (n, k) = readLine()!!.split(" ").map(String::toInt)
    val l = readLine()!!.split(" ").map(String::toInt).sorted().reversed()
    val ans = l.subList(0, k).sum()
    println(ans)
}