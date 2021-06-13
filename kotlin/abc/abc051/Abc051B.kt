package abc.abc051

fun main() {
    val (k, s) = readLine()!!.split(" ").map(String::toInt)
    var ans = 0L
    (0..k).forEach { x ->
        (0..k).forEach { y ->
            val z = s - (x + y)
            if (z in 0..k) ans++
        }
    }
    println(ans)
}