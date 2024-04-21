package java.games;
import java.games.Card.Suit;
import java.games.Card.Value;
import java.io.*;
import java.util.*;

public class CardGame implements GameInterface {
    private Deck deck;
    private ArrayList<Card> chosenCards;

    public CardGame(Deck deck) {
        this.deck = deck;
    }

    @Override
    public void initializeGame() {
        this.chosenCards = new ArrayList<Card>();
        deck.shuffle();
        System.out.println("Card game initialized.");

    }

    @Override
    public void playGame(BufferedReader br) throws Exception {
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Hit <RETURN> to choose a card");
            br.readLine();
            Card chosenCard = deck.drawCard();
            chosenCards.add(chosenCard);
            chosenCard.display();
        }
    }

    @Override
    public void declareWinner() {

        boolean hasAceOfSpades = chosenCards.stream().anyMatch(
            card -> card.suit == Suit.SPADES && card.value == Value.ACE);

        if (hasAceOfSpades) {
            System.out.println("You drew the ACE of SPADES.");
            System.out.println("You won the card game!");
        } else {
            System.out.println("You didn't draw the ACE of SPADES.");
            System.out.println("You lost the card game.");

        }
    }
}
