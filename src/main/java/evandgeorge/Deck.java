package evandgeorge;

import java.util.Collections;
import java.util.LinkedList;

public class Deck {

    //cards in deck. get(0) = top of deck, get(size() - 1) = bottom of deck
    private LinkedList<Card> cards = new LinkedList<Card>();
    
    //creates a standard 52 card deck
    public static Deck newStandardDeck() {
        Deck stdDeck = new Deck();

        for(int rank = 2; rank <= Card.ACE; rank++) {
            stdDeck.cards.add(new Card(Card.Suits.HEARTS, rank));
            stdDeck.cards.add(new Card(Card.Suits.DIAMONDS, rank));
            stdDeck.cards.add(new Card(Card.Suits.CLUBS, rank));
            stdDeck.cards.add(new Card(Card.Suits.SPADES, rank));
        }

        return stdDeck;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    //adds card to top of deck
    public void addOnTop(Card card) {
        cards.addFirst(card);
    }

    //adds card to bottom of deck
    public void addToBottom(Card card) {
        cards.addLast(card);
    }

    //takes card from the top of the deck and removes it from list
    public Card takeFromTop() {
        return cards.removeFirst();
    }

    //takes card from the bottom of the deck and removes it from list
    public Card takeFromBottom() {
        return cards.removeLast();
    }

    //takes card from given index and removes it from the list
    public Card takeFrom(int i) {
        return cards.remove(i);
    }

    //returns the amount of cards in the deck
    public int size() {
        return cards.size();
    }

    //returns card at given index
    public Card cardAt(int i) {
        return cards.get(i);
    }

    public Deck splitDeck() {
        Deck secondDeck = new Deck();
        
        int cardsInFirstDeck = this.size() / 2 + this.size() % 2;
        int cardsInSecondDeck = this.size() / 2;

        for(int i = 0; i < cardsInSecondDeck; i++) {
            secondDeck.addToBottom(this.takeFrom(cardsInFirstDeck));
        }

        return secondDeck;
    }
}