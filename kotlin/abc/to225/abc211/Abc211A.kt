package abc.to225.abc211

private fun main() {
   val (a, b)  = readLine()!!.split(" ").map(String::toDouble)
   val c = (a - b) / 3.0 + b
    println(c)
}