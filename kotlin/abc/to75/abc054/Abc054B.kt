package abc.to75.abc054

fun main() {
    val (n, m) = readLine()!!.split(" ").map(String::toInt)
    val picA = List(n) { readLine()!!.toCharArray().toList() }
    val picB = List(m) { readLine()!!.toCharArray().toList() }

    var isMatch = false
    for (i in 0..n - m) {
        for (j in 0..n - m) {
            val partial = picA.subList(j, j + m).map { it.subList(i, i + m)}
            if (partial == picB) isMatch = true
        }
    }
    if (isMatch) println("Yes") else println("No")
}