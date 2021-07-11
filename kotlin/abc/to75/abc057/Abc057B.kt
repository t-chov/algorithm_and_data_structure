package abc.to75.abc057

import java.io.PrintWriter
import kotlin.math.absoluteValue

fun main() {
    // println は遅いので TLE 防止のために
    val pw = PrintWriter(System.out)
    val (N, M) = readLine()!!.split(" ").map(String::toInt)
    val students = List(N) { readLine()!!.split(" ").map(String::toInt).let { it[0] to it[1] }}
    val checkpoints = List(M) { readLine()!!.split(" ").map(String::toInt).let { it[0] to it[1] }}

    // 律儀に全探索する
    for (student in students) {
        var minDistance = 1L shl 32
        var nearestPoint = -1
        checkpoints.forEachIndexed { index, c ->
            val sx = student.first
            val sy = student.second
            val cx = c.first
            val cy = c.second
            val distance = ((sx - cx).absoluteValue + (sy - cy).absoluteValue).toLong()
            if (distance < minDistance) {
                minDistance = distance
                nearestPoint = index + 1
            }
        }
        pw.println(nearestPoint)
    }

    pw.flush()
}