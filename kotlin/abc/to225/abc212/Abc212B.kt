package abc.to225.abc212

private fun main() {
    val nums = readLine()!!
    if (nums.toCharArray().toSet().size == 1) {
        println("Weak")
        return
    }
    var weak = true
    for (i in 0 until 3) {
        val current = nums[i].toString().toInt()
        val next = nums[i + 1].toString().toInt()
        weak = weak && (current + 1) % 10 == next
    }
    if (weak) {
        println("Weak")
    } else {
        println("Strong")
    }
}