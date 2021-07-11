package abc.to225.abc206

fun main() {
    val n = readLine()!!.toDouble()
    val taxin = (n * 1.08).toInt()
    if (taxin < 206) {
        println("Yay!")
    } else if (taxin == 206) {
        println("so-so")
    } else {
        println(":(")
    }
}