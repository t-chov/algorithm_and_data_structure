package abc.to200.abc195

private fun main() {
    val (A, B, W) = readLine()!!.split(" ").map(String::toDouble)
    val Wg = W * 1000

    var min = Int.MAX_VALUE
    var max = 0

    val theoMax = (Wg / A).toInt() + 1
    for (i in 1..theoMax) {
        val mean = Wg / i
        if (mean in A..B) {
            min = minOf(min, i)
            max = maxOf(max, i)
        }
    }

    if (max == 0) {
        println("UNSATISFIABLE")
    } else {
        println("$min $max")
    }
}