package abc.abc075

fun main() {
    val (h, w) = readLine()!!.split(" ").map(String::toInt)
    val hw = Array(h + 2) { Array(w + 2) { 0 } }
    for (i in 1..h) {
        readLine()!!.toCharArray().forEachIndexed { j, c ->
            hw[i][j + 1] = if(c == '.') 0 else 1
        }
    }
    for (i in 1..h) {
        for (j in 1..w) {
            if (hw[i][j] == 1) {
                print('#')
            } else {
                var sum = 0
                sum += hw[i - 1][j - 1] + hw[i - 1][j] + hw[i - 1][j + 1]
                sum += hw[i][j - 1] + hw[i][j] + hw[i][j + 1]
                sum += hw[i + 1][j - 1] + hw[i + 1][j] + hw[i + 1][j + 1]
                print(sum)
            }
        }
        print("\n")
    }
}