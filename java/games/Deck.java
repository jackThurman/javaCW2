package java.games;
import java.games.Card.Suit;
import java.games.Card.Value;
import java.util.*;

public class Deck {
    public ArrayList<Card> cards = new ArrayList<Card>();
    public int cardCount;

    // Assume deck comes full, i.e 52 cards no jokers
    public Deck() {
        
        for(Suit suit: Card.Suit.values()) {
            for(Value value: Card.Value.values()) {
                Card card = new Card(suit, value);
                cards.add(card);
                cardCount++;
            }
        }
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    public Card drawCard() {

        Random rand = new Random();
        int index = rand.nextInt(cardCount); 
        Card drawnCard = cards.remove(index);
        cardCount--;

        return drawnCard;
    }
}