package evandgeorge;

import java.util.Objects;

public class Card {

    //ranks of face cards
    public static int jack = 11;
    public static int queen = 12;
    public static int king = 13;

    //ranks of aces
    public static int aceHigh = 14;
    public static int aceLow = 1;

    //suit keys
    public static int hearts = 0;
    public static int diamonds = 1;
    public static int clubs = 2;
    public static int spades = 3;

    public int suit;
    public int rank;

    public Card(int suit, int rank) {
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