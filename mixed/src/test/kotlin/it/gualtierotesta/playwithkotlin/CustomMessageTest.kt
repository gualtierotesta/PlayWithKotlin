package it.gualtierotesta.playwithkotlin

import org.junit.Assert.assertEquals
import org.junit.Test

class CustomMessageTest {

    @Test
    fun testNoError() {
        val msg = "This is a message"
        val sut = CustomMessage(msg)
        assertEquals(msg, sut.print())
    }

    @Test
    fun testError() {
        val msg = "This is a message"
        val sut = CustomMessage(msg, true)
        assertEquals("Error: $msg", sut.print())
    }
}

