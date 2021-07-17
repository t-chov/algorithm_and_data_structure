package abc.to225.abc210

private fun main() {
   val (n, a, x, y) = readLine()!!.split(" ").map(String::toInt)
   if (n <= a) {
      println(n * x)
      return
   } else {
      val initial = a * x
      val additional = (n - a) * y
      println(initial + additional)
      return
   }
}