package abc.to75.abc072

fun main() {
    val n = readLine()!!.toInt()
    val a = HashMap<Int, Int>()
    readLine()!!.split(" ").map(String::toInt).forEach { ai ->
        a[ai] = (a[ai] ?: 0) + 1
    }
    var maxX = 1
    val minA = a.keys.min()!!
    val maxA = a.keys.max()!!
    if (maxA - minA <= 2) {
        println(n)
        return
    }
    for (i in minA + 1 until maxA) {
        maxX = maxOf(maxX, (a[i - 1] ?: 0) + (a[i] ?: 0) + (a[i + 1] ?: 0))
    }
    println(maxX)
}