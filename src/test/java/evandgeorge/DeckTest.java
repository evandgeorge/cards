package evandgeorge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DeckTest {
   
    @Test
    public void testSplit() {
        //create a standard deck
        Deck topHalf = Deck.newStandardDeck();
        //split it, store second half in bottomHalf
        Deck bottomHalf = topHalf.splitDeck();

        //create another standard deck for comparing to halves
        Deck stdDeck = Deck.newStandardDeck();

        //compare topHalf with first (top) half of the original deck
        for(int i = 0; i < 26; i++) {
            System.out.println(stdDeck.cardAt(i));
            assertEquals(stdDeck.cardAt(i), topHalf.cardAt(i));
        }

        //compare bottomHalf with last (bottom) half of the original deck
        for(int i = 26; i < 52; i++) {
            assertEquals(stdDeck.cardAt(i), bottomHalf.cardAt(i - 26));
        }
    }

    @Test
    public void testSplit_withOddSize() {
        //create a standard deck and remove the bottom card
        Deck topHalf = Deck.newStandardDeck();
        topHalf.takeFromBottom();

        //split it, store second half in bottomHalf
        Deck bottomHalf = topHalf.splitDeck();

        //create another standard deck and remove last card again for comparing to halves
        Deck stdDeck = Deck.newStandardDeck();
        stdDeck.takeFromBottom();

        //compare topHalf with first (top) half of the original deck
        for(int i = 0; i < 26; i++) {
            assertEquals(stdDeck.cardAt(i), topHalf.cardAt(i));
        }

        //compare bottomHalf with last (bottom) half of the original deck
        for(int i = 26; i < 51; i++) {
            assertEquals(stdDeck.cardAt(i), bottomHalf.cardAt(i - 26));
        }
    }
}
