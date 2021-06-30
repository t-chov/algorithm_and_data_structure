package abc.abc075

fun main() {
    val nums = readLine()!!.split(" ").map(String::toInt).sorted()
    if (nums[0] != nums[1]) println(nums[0])
    else println(nums[2])
}