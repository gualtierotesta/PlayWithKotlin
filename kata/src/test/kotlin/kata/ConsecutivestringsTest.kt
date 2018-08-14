package kata

import kata.Consecutivestrings.longestConsec
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ConsecutivestringsTest {

    @Test
    fun test() {
        println("longestConsec Fixed Tests")
        testing(longestConsec(arrayOf<String>("zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"), 2), "abigailtheta")
        testing(longestConsec(arrayOf<String>("ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"), 1), "oocccffuucccjjjkkkjyyyeehh")

    }
    companion object {
        private fun testing(actual:String, expected:String) {
            assertEquals(expected, actual)
        }
    }
}