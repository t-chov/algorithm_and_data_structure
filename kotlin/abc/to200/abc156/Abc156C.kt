package abc.to200.abc156

fun main() {
    val n = readLine()!!.toInt()
    val x = readLine()!!.split(" ").map(String::toLong).sorted()
    // 全探索でよい
    val costs = (x.first()..x.last()).map { p ->
        x.map { xi ->
            (xi - p) * (xi - p)
        }.sum()
    }
    println(costs.sorted().first())
}