package evandgeorge;

import java.util.Objects;

public class Card {

    //ranks of face cards
    public static int JACK = 11;
    public static int QUEEN = 12;
    public static int KING = 13;
    public static int ACE = 14;

    //suits
    public enum Suits {
        HEARTS, DIAMONDS, CLUBS, SPADES;
    }

    //suit and rank of individual card
    public Suits suit;
    public int rank;

    public Card(Suits suit, int rank) {
        this.suit = suit;
        this.rank = rank;
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