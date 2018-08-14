package kata

import java.util.*
import kotlin.collections.HashSet


fun containAllRots(strng: String, arr: ArrayList<String>): Boolean {
    return arr.containsAll(rotations(strng))
}

private fun rotations(str: String): Set<String> {
    val n = str.length
    val retval = HashSet<String>()
    for (i in 0 until n) {
        val sb = StringBuilder()
        for (j in i + 1 until n)
            sb.append(str[j])
        for (k in 0..i)
            sb.append(str[k])
        retval.add(sb.toString())
    }
    return retval
}