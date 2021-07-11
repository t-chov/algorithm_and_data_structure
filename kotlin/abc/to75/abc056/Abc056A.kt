package abc.to75.abc056

fun main() {
    val (a, b) = readLine()!!.split(" ")
    if (a == "H") {
        println(b)
    } else {
        val ans = if (b == "H") "D" else "H"
        println(ans)
    }
}