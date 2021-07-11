package abc.to125.abc106

fun main() {
    val s = readLine()!!.toCharArray()
    val k = readLine()!!.toLong()
    val ones = s.takeWhile { it == '1' }
    if (k <= ones.size) {
        println('1')
        return
    }

    val firstDigit = s.filterNot { it == '1' }.let {
        if (it.isEmpty()) '1'
        else it.first()
    }
    println(firstDigit)
}