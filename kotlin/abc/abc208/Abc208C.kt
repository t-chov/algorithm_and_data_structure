package abc.abc208

import java.io.PrintWriter

fun main() {
    // println は遅いので TLE 防止のために
    val pw = PrintWriter(System.out)
    // solve here
    val (n, k) = readLine()!!.split(" ").map(String::toLong)

    val start = k / n
    val amari = (k % n).toInt()

    if (amari == 0) {
        (1..n).forEach {
            pw.println(start)
        }
        pw.flush()
        return
    }

    val A = readLine()!!.split(" ").map(String::toLong)
    val sortedA = A.sorted()
    val threshold = sortedA[amari - 1]
    A.forEach { ai ->
        if (ai <= threshold) {
            pw.println(start + 1)
        } else {
            pw.println(start)
        }
    }
    pw.flush()
}