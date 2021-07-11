package abc.to75.abc062

fun main() {
    val (H, W) = readLine()!!.split(" ").map(String::toInt)
    println("#".repeat(W + 2))
    (0 until H).forEach {
        print("#")
        print(readLine()!!.trim())
        println("#")
    }
    println("#".repeat(W + 2))
}