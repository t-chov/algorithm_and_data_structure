package spot
// https://atcoder.jp/contests/keyence2019/tasks/keyence2019_b

private fun main() {
    val S = readLine()!!
    val len = S.length
    for (i in 0 until len) {
        for (j in i until len) {
            val front = S.substring(0, i)
            val rear = S.substring(j, len)
            // println("$front $rear")
            if (front + rear == "keyence") {
                print("YES")
                return
            }
        }
    }
    print("NO")
}