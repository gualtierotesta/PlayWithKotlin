package kata



operator fun kotlin.Int.Companion.invoke(s: String): Int = s.toInt()
operator fun kotlin.Long.Companion.invoke(s: String): Long = s.toLong()
operator fun kotlin.Double.Companion.invoke(s: String): Double = s.toDouble()


fun main(args: Array<String>) {
    val i = kotlin.Int("42")
    val l = kotlin.Long("42")
    val d = kotlin.Double("42")
    println("i=$i l=$l d=$d")
}

