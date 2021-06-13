package abc.abc205

import kotlin.math.abs

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map(String::toLong)
    print(solve(a, b, c))
}

fun solve(a: Long, b: Long, c: Long): String {
    if (c % 2L == 0L) {
        return when {
            abs(a) < abs(b) -> "<"
            abs(a) > abs(b) -> ">"
            else -> "="
        }
    }

    // C は奇数乗
    // (1)a < 0 (2)a = 0 (3)a > 0
    // (A)b < 0 (B)b = 0 (C)b > 0
    if ((a < 0L && b < 0L) || (a > 0L && b > 0L)) { //1A 3C
        return when {
            a < b -> "<"
            a > b -> ">"
            else -> "="
        }
    }

    if (a < 0L) return "<" // b >= 0 は保証されている. 1B 1C
    if (b < 0L) return ">" // a >= 0 は保証されている. 2A 3A
    if (a == 0L) {
        return when {
            b < 0L -> ">"
            b > 0L -> "<"
            else -> "="
        }
    }

    // b = 0 のとき
    return when {
        a > 0L -> ">"
        b < 0L -> "<"
        else -> "="
    }
}