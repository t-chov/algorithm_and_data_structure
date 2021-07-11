package abc.to50.abc043

fun main() {
    val input = readLine()!!.toCharArray()
    var s = ""
    input.forEach { c ->
        if (s.isEmpty() && c == 'B') {
            return@forEach
        }
        when (c) {
            'B' -> s = s.dropLast(1)
            else -> s += c
        }
    }
    println(s)
}