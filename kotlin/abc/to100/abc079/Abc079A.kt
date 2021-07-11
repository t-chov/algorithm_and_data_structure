package abc.to100.abc079

fun main() {
    val n = readLine()!!
    if (n.matches(Regex(".?(000|111|222|333|444|555|666|777|888|999).?"))) {
        println("Yes")
    } else {
        println("No")
    }
}