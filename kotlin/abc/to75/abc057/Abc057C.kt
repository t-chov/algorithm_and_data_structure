package abc.to75.abc057

import kotlin.math.sqrt

fun main() {
    val N = readLine()!!.toLong()
    val upper = sqrt(N.toDouble()).toLong() + 1L
    (upper downTo 1L).forEach { x ->
        if (N % x == 0L) {
            val ans = maxOf(
                    x.toString().length,
                    (N / x).toString().length
            )
            println(ans)
            return
        }
    }
}