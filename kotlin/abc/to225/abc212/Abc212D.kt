package abc.to225.abc212

import java.io.PrintWriter
import java.util.*

private fun main() {
    val pw = PrintWriter(System.out)
    val Q = readLine()!!.toInt()
    val queue = PriorityQueue<Long>(Q)
    var sum = 0L
    for (i in 0 until Q) {
        val query = readLine()!!.toString().split(" ").map(String::toLong)
        if (query.first() == 1L) {
            queue.offer(query.last() - sum)
        } else if (query.first() == 2L) {
            sum += query.last()
        } else {
            val q = queue.poll()
            pw.println(q + sum)
        }
    }
    pw.flush()
}