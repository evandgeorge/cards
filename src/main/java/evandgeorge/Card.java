package evandgeorge;

import java.util.Objects;

public class Card {

    //ranks of face cards
    public static final int JACK = 11;
    public static final  int QUEEN = 12;
    public static final  int KING = 13;
    public static final  int ACE = 14;

    //suits
    public static enum Suits {
        HEARTS, DIAMONDS, CLUBS, SPADES;
    }

    //suit and rank of individual card
    public Suits suit;
    public int rank;

    public Card(Suits suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    //converts card to string representation for debugging
    public String toString() {
        return "Rank: " + rank + "Suit: " + suit;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Card))
            return false;
        if(this == obj)
            return true;

        return this.suit == ((Card) obj).suit && this.rank == ((Card) obj).rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }
}