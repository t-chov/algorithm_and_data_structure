package abc.to50.abc047

fun main() {
    val s = readLine()!!.toCharArray()
    var current = s.first()
    var flip = 0
    for (i in 1 until s.size) {
        if (s[i] != current) {
            current = s[i]
            flip++
        }
    }
    println(flip)
}