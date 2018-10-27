package evandgeorge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuitTest {

    @Test
    public void test_nameOfHEARTS() {
        assertEquals("Hearts", Suit.HEARTS.toString());
    }

    @Test
    public void test_nameOfDIAMONDS() {
        assertEquals("Diamonds", Suit.DIAMONDS.toString());
    }

    @Test
    public void test_nameOfCLUBS() {
        assertEquals("Clubs", Suit.CLUBS.toString());
    }

    @Test
    public void test_nameOfSPADES() {
        assertEquals("Spades", Suit.SPADES.toString());
    }
}
