package abc.abc064


enum class Rate {
    GRAY,
    BROWN,
    GREEN,
    PALE,
    BLUE,
    YELLOW,
    ORANGE,
    RED,
    FREE
}

fun main() {
    val N = readLine()!!.toInt()
    val rates = readLine()!!.split(" ").map(String::toInt).map {
        when {
            it < 400 -> Rate.GRAY
            it < 800 -> Rate.BROWN
            it < 1200 -> Rate.GREEN
            it < 1600 -> Rate.PALE
            it < 2000 -> Rate.BLUE
            it < 2400 -> Rate.YELLOW
            it < 2800 -> Rate.ORANGE
            it < 3200 -> Rate.RED
            else -> Rate.FREE
        }
    }
    val ratesSet = rates.toSet()
    val colors = ratesSet.size
    val freeCount = rates.count { it == Rate.FREE }

    if (Rate.FREE !in ratesSet) {
        println("$colors $colors")
        return
    }

    val maxC = colors + freeCount - 1
    println("${maxOf(colors - 1, 1)} $maxC")
}