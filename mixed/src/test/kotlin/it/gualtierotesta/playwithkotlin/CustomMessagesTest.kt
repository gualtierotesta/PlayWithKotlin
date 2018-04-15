package it.gualtierotesta.playwithkotlin

import org.junit.Before
import org.junit.Test

import org.junit.Assert.assertEquals

class CustomMessagesTest {

    private var sut: CustomMessages? = null

    @Test
    fun testUno() {
        assertEquals("Hello world", sut!!.hello())
    }

    @Before
    fun before() {
        sut = CustomMessages()
    }


}