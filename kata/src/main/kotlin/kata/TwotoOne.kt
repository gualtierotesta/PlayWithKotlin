package kata

import java.util.*

/**
 * Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the
 * longest possible, containing distinct letters,

each taken only once - coming from s1 or s2. #Examples: ``` a = "xyaabbbccccdefww" b = "xxxxyyyyabklmopq" longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz" longest(a, a) -> "abcdefghijklmnopqrstuvwxyz" ```

 */
class TwotoOne {

    fun longest(s1:String, s2:String):String {
        val cSet = TreeSet<Char>()
        s1.forEach { c -> cSet.add(c) }
        s2.forEach { c -> cSet.add(c) }
        return cSet.joinToString(separator = "")
    }
}