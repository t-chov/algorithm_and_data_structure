package abc.abc060

fun main() {
    val (A, B, C) = readLine()!!.split(" ").map(String::toLong)
    if (A == 1L) {
        println("YES")
        return
    }
    val mods = HashSet<Long>()
    for (i in 1..B) {
        mods.add((A * i) % B)
    }
    if (mods.contains(C)) println("YES")
    else println("NO")
}