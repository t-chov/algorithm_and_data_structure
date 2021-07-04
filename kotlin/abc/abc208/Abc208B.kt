package abc.abc208

fun main() {
    var p = readLine()!!.toLong()
    val coins = Array(11){1L}
    for (i in 1..10) {
        coins[i] = coins[i - 1] * i
    }
    var ans = 0L
    for (i in 10 downTo 1) {
        if (coins[i] <= p) {
            val pay = p / coins[i]
            // println("$p $pay ${coins[i]}")
            ans += pay
            p -= coins[i] * pay
        }
        if (p == 0L) {
            break
        }
    }
    println(ans)
}
