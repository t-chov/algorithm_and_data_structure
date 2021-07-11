package abc.to75.abc058

fun main() {
    val pillars = readLine()!!.split(" ").map(String::toInt)
    if (pillars[1] - pillars[0] == pillars[2] - pillars[1]) {
        println("YES")
    } else {
        println("NO")
    }
}