package typical90
// https://qiita.com/e869120/items/1b2a5f0f07fd927e44e9
// https://atcoder.jp/contests/typical90/tasks/typical90_d
// https://twitter.com/e869120/status/1378115289649348611

// 解法自体は最初から分かっていたが、TLEギリギリなのでC++必須か?
fun main() {
    val (H, W) = readLine()!!.split(" ").map(String::toInt)
    val numbers = List(H) { readLine()!!.split(" ").map(String::toLong) }

    val rowsSum = List(H) { 0L }.toMutableList()
    val columnSum = List(W) { 0L }.toMutableList()

    // O(HW)
    (0 until H).forEach { h ->
        rowsSum[h] = numbers[h].sum()
        (0 until W).forEach { w ->
            columnSum[w] += numbers[h][w]
        }
    }
    // O(HW)
    numbers.forEachIndexed { h, row ->
        val crossSumRow = row.mapIndexed() { w, n ->
            rowsSum[h] + columnSum[w] - n
        }.joinToString(" ")
        println(crossSumRow)
    }
}