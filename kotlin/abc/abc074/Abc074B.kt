package abc.abc074

fun main() {
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    val sum = readLine()!!.split(" ").map(String::toInt).sumBy {
        if (it <= (k / 2)) it * 2
        else (k - it) * 2
    }
    println(sum)
}