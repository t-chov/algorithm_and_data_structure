package abc.to75.abc059

fun main() {
    val words = readLine()!!.split(" ")
    val acro = words.map(String::first).joinToString("").toUpperCase()
    println(acro)
}