package abc.to100.abc082

fun main() {
    val s = readLine()!!.toCharArray().sorted().joinToString("")
    val t = readLine()!!.toCharArray().sortedDescending().joinToString("")

    if (s.length < t.length) {
        if (s == t.substring(0, s.length)) {
            println("Yes")
            return
        }
    }

    if (s < t) {
        println("Yes")
    } else {
        println("No")
    }
}