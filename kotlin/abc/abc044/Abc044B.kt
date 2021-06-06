package abc.abc044

fun main() {
    val w = readLine()!!
    val wc = w.toCharArray()
    val nonBeautiful = wc.map { c ->
        wc.count { it == c } % 2 != 0
    }.filter { it }
    if (nonBeautiful.count() > 0) {
        println("No")
    } else {
        println("Yes")
    }
}