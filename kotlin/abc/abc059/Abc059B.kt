package abc.abc059

fun main() {
    val A = readLine()!!
    val B = readLine()!!
    if (A == B) {
        println("EQUAL")
        return
    }
    if (A.length > B.length) {
        println("GREATER")
        return
    }
    if (A.length < B.length) {
        println("LESS")
        return
    }
    // 桁数が同じ
    A.zip(B).forEach {
        val a = it.first
        val b = it.second
        if (a.toInt() > b.toInt()) {
            println("GREATER")
            return
        }
        if (a.toInt() < b.toInt()) {
            println("LESS")
            return
        }
    }
}