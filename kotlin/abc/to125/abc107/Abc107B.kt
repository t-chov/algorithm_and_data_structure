package abc.to125.abc107

private fun main() {
    var (h, w) = readLine()!!.split(" ").map(String::toInt)
    val grid = MutableList(h) {
        readLine()!!.toCharArray().toMutableList()
    }
    var cont = true
    while(cont) {
        cont = false
        for (i in 0 until h) {
            if (grid[i].distinct() == listOf('.')) {
                grid.removeAt(i)
                h--
                cont = true
                break
            }
            for (j in 0 until w) {
                val tate = grid.map { it[j] }.distinct()
                if (tate == listOf('.')) {
                    grid.forEach { it.removeAt(j) }
                    w--
                    cont = true
                    break
                }
            }
        }
    }
    grid.forEach {
        println(it.joinToString(""))
    }
}