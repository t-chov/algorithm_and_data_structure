package abc.to225.abc213

import java.io.PrintWriter

private fun main() {
    val pw = PrintWriter(System.out)
    val (H, W, N) = readLine()!!.split(" ").map(String::toInt)
    val cards = Array(N) {
        readLine()!!.split(" ").map(String::toInt).let{ it[0] to it [1]}
    }
    val sortedH = cards.map { it.first }.toSortedSet().toList()
    val sortedW = cards.map { it.second }.toSortedSet().toList()
    for (i in 0 until N) {
        val h = sortedH.binarySearch(cards[i].first) + 1
        val w = sortedW.binarySearch(cards[i].second) + 1
        pw.println("${h} ${w}")
    }

    pw.flush()
}