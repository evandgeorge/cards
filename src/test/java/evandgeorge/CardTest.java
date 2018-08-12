package evandgeorge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class CardTest {

    Card c1 = new Card(1, 5);
    Card c2 = new Card(1, 5);
    Card c3 = new Card(5, 5);

   @Test
   public void testEquals() {
        assertTrue(c3.equals(c3));
        assertTrue(c1.equals(c2));
        assertTrue(c2.equals(c2));
        assertTrue(!c1.equals(c3));
   }

   @Test
   public void testHashCode() {
       assertEquals(c1.hashCode(), c2.hashCode());
       assertNotEquals(c1.hashCode(), c3.hashCode());
   }
}
