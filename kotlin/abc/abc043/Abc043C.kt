package abc.abc043

fun main() {
    val N = readLine()!!.toInt()
    val nums = readLine()!!.split(" ").map(String::toInt)
    // 二分探索とかせずとも全探索でよい N=100 の N^2
    println((-100..100).map { n ->
        nums.map { (it - n) * (it - n) }.sum()
    }.min())
}