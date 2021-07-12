package abc.to225.abc203

private fun main() {
    val abc = readLine()!!.split(" ").map(String::toInt).sorted()
    if (abc[0] == abc[1]) println(abc[2])
    else if (abc[1] == abc[2]) println(abc[0])
    else println(0)
}