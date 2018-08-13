package evandgeorge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import evandgeorge.Card.Suits;

public class CardTest {

    //test cards
    Card c1 = new Card(Suits.DIAMONDS, 5);
    Card c2 = new Card(Suits.DIAMONDS, 5);
    Card c3 = new Card(Suits.CLUBS, 5);

   @Test
   public void testEquals() {
        //test overridden equals() method
        assertEquals(c3, c3);
        assertEquals(c1, c2);
        assertEquals(c2, c2);
        assertNotEquals(c1, c3);
   }

   @Test
   public void testHashCode() {
       //test overridden hashCode() method
       assertEquals(c1.hashCode(), c2.hashCode());
       assertNotEquals(c1.hashCode(), c3.hashCode());
   }
}
