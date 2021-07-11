package abc.to75.abc058

fun main() {
    val O = readLine()!!
    val E = readLine()!!
    O.forEachIndexed { index, c ->
        print(c)
        if (E.length > index) print(E[index])
    }
}