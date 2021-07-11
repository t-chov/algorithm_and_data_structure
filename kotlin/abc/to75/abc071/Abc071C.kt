package abc.to75.abc071

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map(String::toLong).sortedDescending()
    var tanpen = 0L
    var chohen = 0L
    var i = 0
    while (i < n - 1 && tanpen == 0L) {
        if (a[i] == a[i + 1]) {
            if (chohen == 0L) {
                chohen = a[i]
            } else if (tanpen == 0L) {
                tanpen = a[i]
            }
            i += 2
        } else {
            i++
        }
    }
    println(tanpen * chohen)
}