package kata

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CleanUpAfterYourDogKtTest {

    @Test
    fun testFixed() {
        assertEquals("Clean",
                crap(arrayOf(charArrayOf('_', '_', '_', '_'), charArrayOf('_', '_', '_', '@'), charArrayOf('_', '_', '@', '_')), 2, 2))
        //assertEquals("Cr@p", crap(arrayOf(charArrayOf('_', '_', '_', '_'), charArrayOf('_', '_', '_', '@'), charArrayOf('_', '_', '@', '_')), 1, 1))
        //assertEquals("Dog!!", crap(arrayOf(charArrayOf('_', '_'), charArrayOf('_', '@'), charArrayOf('D', '_')), 2, 2))
    }
}