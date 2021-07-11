package abc.to75.abc058

fun main() {
    val n = readLine()!!.toInt()
    val strings = List(n) { readLine()!! }
    val bunpu = ('a'..'z').map { c ->
        val cnt = strings.map { s -> s.count { it == c} }.min() ?: 0
        c to cnt
    }
    bunpu.forEach { b ->
        (0 until b.second).forEach { print(b.first) }
    }
}