package abc.abc073

fun main() {
    val n = readLine()!!.toInt()
    val s = HashSet<Long>()
    (0 until n).forEach { _ ->
        val a = readLine()!!.toLong()
        if (a in s) s.remove(a)
        else s.add(a)
    }
    println(s.size)
}