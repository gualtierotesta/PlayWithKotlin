package kata

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigInteger

internal class ColorChoiceKtTest {

    @Test
    fun basicTests() {
        println("****** Basic Tests ******")
        assertEquals(2, checkchoose(6, 4))
        assertEquals(1, checkchoose(4, 4))
        assertEquals(3, checkchoose(35, 7))
        assertEquals(20, checkchoose(47129212243960, 50))
    }

    @Test
    fun testFact() {
        assertEquals(BigInteger.ONE, fact(0))
        assertEquals(BigInteger.ONE, fact(1))
        assertEquals(BigInteger.valueOf(2), fact(2))
        assertEquals(BigInteger.valueOf(3_628_800), fact(10))
        assertEquals(BigInteger.valueOf(355_687_428_096_000), fact(17))
    }
}