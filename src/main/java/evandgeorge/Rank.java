package evandgeorge;

public enum Rank {

    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14);

    private int numericalRank;

    private Rank(int r) {
        numericalRank = r;
    }

    public boolean outranks(Rank rank) {
        return this.numericalRank > rank.numericalRank;
    }

    @Override
    public String toString() {  //Returns name of enum with capitalization corrected
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
