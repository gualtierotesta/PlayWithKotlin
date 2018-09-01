package kata

fun partlist(arr: Array<String>): Array<Array<String>> {
    val n = arr.size
    return (1 until n)
            .map {
                arrayOf(
                        arr.copyOfRange(0, it).joinToString(" "),
                        arr.copyOfRange(it, n).joinToString(" "))
            }
            .toTypedArray()
}
