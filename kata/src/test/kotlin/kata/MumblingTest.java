package kata;

import org.junit.jupiter.api.Test;

import static kata.MumblingKt.accum;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MumblingTest {

    @Test
    void testAccum() {
        assertEquals("A-Bb-Ccc-Dddd", accum("abcd"));
        assertEquals("R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy", accum("RqaEzty"));
        assertEquals("C-Ww-Aaa-Tttt", accum("cwAt"));
    }
}