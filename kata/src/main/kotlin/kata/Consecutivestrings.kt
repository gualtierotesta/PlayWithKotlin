package kata

/**
 * https://www.codewars.com/kata/consecutive-strings/train/kotlin
 */
object Consecutivestrings {

    fun longestConsec(strarr: Array<String>, k: Int): String {
        val n = strarr.size
    return if (n == 0 || k > n || k <= 0) "" else
    strarr
    .filterIndexed { index, _ -> index <= (n - k) }
    .mapIndexed { index, _ -> add(strarr, index, k) }
    .maxBy { it -> it.length }!!
}

private fun add(strarr: Array<String>, index: Int, k: Int): String {
    var res = ""
    for (i in index until index + k) {
        res += strarr[i]
    }
    return res
}

    @JvmStatic
    fun main(args: Array<String>) {
        println("XX:" + longestConsec(arrayOf<String>("zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"), 2))
    }

}