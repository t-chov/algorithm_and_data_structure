package abc.to225.abc201

private fun main() {
    val S = readLine()!!.toCharArray().mapIndexed { index, c ->
        index to c
    }.filter { it.second != 'x' }.toMap()
    var ans = 0
    for (i in 0 until 10000) {
        val repl = i.toString().padStart(4, '0')
        if (solve(repl, S)) {
            // println(repl)
            ans++
        }
    }
    println(ans)
}

private fun solve(repl: String, s: Map<Int, Char>): Boolean {
    val used = HashSet<Int>()
    val expected = s.filter { it.value == 'o' }.keys.toSet()
    for (n in repl) {
        val ni = n.toString().toInt()
        if (s.containsKey(ni)) {
            used.add(ni)
        } else {
            return false
        }
    }
    return used.intersect(expected) == expected
}