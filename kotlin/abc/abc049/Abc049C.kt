package abc.abc049

fun main() {
    var s = readLine()!!
    val partials = setOf(
            "dream",
            "dreamer",
            "erase",
            "eraser"
    )
    while (s.isNotEmpty()) {
        var isHit = false
        for (partial in partials) {
            if (s.endsWith(partial)) {
                s = s.dropLast(partial.length)
                isHit = true
            }
        }
        if (!isHit) {
            break
        }
    }

    if (s.isEmpty()) {
        println("YES")
    } else {
        println("NO")
    }
}