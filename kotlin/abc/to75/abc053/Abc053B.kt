package abc.to75.abc053

fun main() {
    val s = readLine()!!
    val start = s.indexOf('A')
    val end = s.lastIndexOf('Z')
    print(end - start + 1)
}