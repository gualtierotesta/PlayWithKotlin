package kata

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.*

internal class Trick0KtTest {

@Test
fun testInt() {
    val r = Random(System.currentTimeMillis())
    (0..100).forEach { r.nextInt().let { assertEquals(it, kotlin.Int(it.toString())) } }
}
}