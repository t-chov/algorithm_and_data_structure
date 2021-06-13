package abc.abc205

fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map(String::toInt)

    var ans = true
    A.sorted().forEachIndexed { index, a ->
        ans = ans && index + 1 == a
    }
    println(if (ans) "Yes" else "No")
}