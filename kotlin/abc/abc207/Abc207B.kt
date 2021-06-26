package abc.abc207

fun main() {
    val (a, b, c, d) = readLine()!!.split(" ").map(String::toDouble)
    if (b / c >= d) {
        println(-1)
        return
    }
    var blue = a + b
    var red = c
    var ops = 1
    while (blue / red > d) {
        blue += b
        red += c
        // println("${blue} ${red}")
        ops++
    }
    println(ops)
}