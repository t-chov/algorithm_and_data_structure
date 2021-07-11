package abc.to75.abc072

fun main() {
    val s = readLine()!!.toCharArray().filterIndexed { index, _ -> index % 2 == 0 }.joinToString("")
    println(s)
}