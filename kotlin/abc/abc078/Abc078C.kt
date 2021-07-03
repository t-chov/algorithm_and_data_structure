package abc.abc078

fun main() {
    // 有効なのが来るまでカードを引く期待値は、有効なカードを引く確率の逆数になる
    // https://blog.hamayanhamayan.com/entry/2016/11/14/223727
    val (n, m) = readLine()!!.split(" ").map(String::toLong)
    val time = 1900L * m + 100 * (n - m)
    var x = 1L
    (1..m).forEach { x *= 2L }
    println(time * x)
}