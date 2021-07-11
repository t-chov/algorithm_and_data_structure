package abc.to125.abc121

fun main() {
    val (N, M, C) = readLine()!!.split(" ").map(String::toInt)
    val B = readLine()!!.split(" ").map(String::toInt)
    val sources = List(N) { readLine()!!.split(" ").map(String::toInt) }
    val cnt = sources.map { an ->
        an.mapIndexed { index, ani ->
            ani * B[index]
        }.sum() + C
    }.filter { it > 0 }.count()
    print(cnt)
}