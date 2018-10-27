package evandgeorge;

public enum Suit {

    HEARTS("Hearts"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs"),
    SPADES("Spades");

    private String name;

    private Suit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
