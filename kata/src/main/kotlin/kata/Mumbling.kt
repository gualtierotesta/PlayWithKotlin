package kata

fun buildString(c: Char, count: Int): String {
    var res = c.toString().toUpperCase()
    for (i in 1..count) {
        res += c.toString().toLowerCase()
    }
    return res
}

fun accum(s: String): String {
    var i = 0
    return s.asSequence()
            .map { c -> buildString(c, i++) }
            .joinToString("-")
}

// Soluzione 2
fun accum2(s: String): String =
        s.mapIndexed { index, char -> char.toUpperCase() + char.toString().toLowerCase().repeat(index) }
                .joinToString("-")


//// Soluzione 3
//fun accum3(s: String): String {
//    return
//    s.toLowerCase()
//            .mapIndexed { index, char -> char.toUpperCase().toString().padEnd(index + 1, char) }
//            .joinToString("-")
//}

// Soluzione 4
fun accum4(s: String) =
        (0..s.lastIndex)
                .map { ("" + s[it]).toLowerCase().repeat(it + 1).capitalize() }
                .joinToString("-")