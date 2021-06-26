package abc.abc207

fun main() {
    val n = readLine()!!.toInt()
    val kukans = List(n) {
        val (t, l, r) = readLine()!!.split(" ").map(String::toLong)
        when (t.toInt()) {
            1 -> Kukan(l, r, true, true)
            2 -> Kukan(l, r, true, false)
            3 -> Kukan(l, r, false, true)
            else -> Kukan(l, r, false, false)
        }
    }
    var ans = 0
    for (i in 0 until n - 1) {
        for (j in i + 1 until n) {
            if (kukans[i].hasIntersect(kukans[j])) {
                ans++
            }
        }
    }
    println(ans)
}

data class Kukan (
    val min: Long,
    val max: Long,
    val includeMin: Boolean,
    val includeMax: Boolean
) {
    fun hasIntersect(other: Kukan): Boolean {
        val iMin = maxOf(other.min, min)
        val iMax = minOf(other.max, max)
        if (iMin < iMax) {
            return true
        } else if (iMax < iMin) {
            return false
        }
        if (max == other.min) {
            return includeMax && other.includeMin
        }
        if (min == other.max) {
            return includeMin && other.includeMax
        }
        return false
    }
}