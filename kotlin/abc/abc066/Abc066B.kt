package abc.abc066

fun main() {
    val s = readLine()!!
    for (i in 2 until s.length step 2) {
        val front = s.substring(0, (s.length/2) - i / 2)
        val rear = s.substring((s.length/2) - i / 2, s.length - i)
        if (front == rear) {
            println(front.length + rear.length)
            return
        }
    }
    println(0)
}