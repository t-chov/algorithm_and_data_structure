package abc.abc045

fun main() {
    var sa = readLine()!!
    var sb = readLine()!!
    var sc = readLine()!!

    var turn = 'a'
    while (true) {
        if (turn == 'a') {
            if (sa.isEmpty()) {
                println('A')
                break
            }
            turn = sa[0]
            sa = sa.substring(1)
        }
        if (turn == 'b') {
            if (sb.isEmpty()) {
                println('B')
                break
            }
            turn = sb[0]
            sb = sb.substring(1)
        }
        if (turn == 'c') {
            if (sc.isEmpty()) {
                println('C')
                break
            }
            turn = sc[0]
            sc = sc.substring(1)
        }
    }
}