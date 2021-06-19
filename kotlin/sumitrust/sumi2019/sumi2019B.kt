package sumitrust.sumi2019


fun main() {
    val n = readLine()!!.toInt()
    val net = n.toDouble() / 1.08
    val price = net.toInt()
    // println((price + 1) * 1.08)
    if ((price * 1.08).toInt() == n) {
        println(price)
    } else if (((price + 1) * 1.08).toInt() == n) {
        println(price + 1)
    } else {
        println(":(")
    }
}