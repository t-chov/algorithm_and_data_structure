package abc.to75.abc071

fun main() {
    val s = readLine()!!.toCharArray().toSet()
    val a2z = ('a'..'z').toSet()
    val ans = a2z - s
    if (ans.isEmpty()) println("None")
    else println(ans.min()!!)
}