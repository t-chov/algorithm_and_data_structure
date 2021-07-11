package abc.to150.abc139

fun main() {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)
    var sum = 1
    var taps = 0
    while (sum < b) {
        sum = sum - 1 + a
        taps ++
    }
    println(taps)
}