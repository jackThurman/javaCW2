package java.games;

public class Card {
    public Suit suit;
    public Value value;
    
    // Constants for suit and value
    public static enum Suit {
        DIAMONDS,
        CLUBS,
        HEARTS,
        SPADES
    }

    public static enum Value {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    }

    // No default constructor, only with specified suit and value
    public Card(Suit suit, Value value){
        this.suit = suit;
        this.value = value;
    }

    public void display() {
        System.out.println(value +  " of " + suit);
    }
}

