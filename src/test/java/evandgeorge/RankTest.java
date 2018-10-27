package evandgeorge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RankTest {

    @Test
    public void test_outranks() {
        assertTrue(Rank.ACE.outranks(Rank.EIGHT));
        assertFalse(Rank.EIGHT.outranks(Rank.ACE));
    }

    @Test
    public void test_JACKtoString() {
        assertEquals("Jack", Rank.JACK.toString());
    }

    @Test
    public void test_QUEENtoString() {
        assertEquals("Queen", Rank.QUEEN.toString());
    }

    @Test
    public void test_KINGtoString() {
        assertEquals("King", Rank.KING.toString());
    }

    @Test
    public void test_ACEtoString() {
        assertEquals("Ace", Rank.ACE.toString());
    }

    @Test
    public void test_THREEtoString() {
        assertEquals("Three", Rank.THREE.toString());
    }
}
