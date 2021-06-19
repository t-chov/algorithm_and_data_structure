package codefes.cf2016qb

import java.io.PrintWriter

fun main() {
    // println は遅いので TLE 防止のために
    val pw = PrintWriter(System.out)
    // solve here
    val (n, a, b) = readLine()!!.split(" ").map(String::toInt)
    val s = readLine()!!.toCharArray()

    val maxRank =  a + b
    var pass = 0
    var passForeign = 0
    s.forEach { c ->
        // println("$pass $passForeign")
        when (c) {
            'a' -> {
                if (pass < maxRank) {
                    pw.println("Yes")
                    pass++
                } else {
                    pw.println("No")
                }
            }
            'b' -> {
                if (pass < maxRank && passForeign < b) {
                    pw.println("Yes")
                    pass++
                    passForeign++
                } else {
                    pw.println("No")
                }

            }
            else -> pw.println("No")
        }
    }

    pw.flush()
}