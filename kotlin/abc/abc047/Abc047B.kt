package abc.abc047

fun main() {
    val (w, h, n) = readLine()!!.split(" ").map(String::toInt)
    val ops = List(n) { readLine()!!.split(" ").map(String::toInt) }

    var (minX, minY, maxX, maxY) = listOf(0, 0, w, h)
    ops.forEach { op ->
        when (op.last()) {
            1 -> minX = maxOf(minX, op[0])
            2 -> maxX = minOf(maxX, op[0])
            3 -> minY = maxOf(minY, op[1])
            else -> maxY = minOf(maxY, op[1])
        }
    }
    print(maxOf(maxX - minX, 0) * maxOf(maxY - minY, 0))
}