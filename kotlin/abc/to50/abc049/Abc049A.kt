package abc.to50.abc049

fun main() {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    val c = readLine()!!.toCharArray().first()
    if (vowels.contains(c)) {
        println("vowel")
    } else {
        println("consonant")
    }
}