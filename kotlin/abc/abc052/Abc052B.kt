package abc.abc052

fun main() {
    val N = readLine()!!.toInt()
    val S = readLine()!!.toCharArray()
    val nums = Array(N) { 0 }
    nums[0] = if (S[0] == 'I') 1 else -1
    for (i in 1 until N) {
        val diff = if (S[i] == 'I') 1 else -1
        nums[i] = nums[i - 1] + diff
    }
    println(maxOf(0, nums.max()!!))
}