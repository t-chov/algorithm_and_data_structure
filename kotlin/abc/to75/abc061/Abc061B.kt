package abc.to75.abc061

fun main() {
    val (N, M) = readLine()!!.split(" ").map(String::toInt)
    val roads = List(M) { readLine()!!.split(" ").map(String::toInt).let { it[0] to it[1] }}
    val paths = (0 until N).map { n ->
        roads.filter {
            it.first - 1 == n || it.second - 1 == n
        }.count()
    }
    paths.forEach {
        println(it)
    }
}