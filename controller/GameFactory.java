package java.controller;
import java.games.CardGame;
import java.games.Coin;
import java.games.CoinGame;
import java.games.Deck;
import java.games.DiceGame;
import java.games.Die;

public class GameFactory {

    public GameFactory(){
    }

    public static CoinGame createCoinGame(Coin coin) {
        return new CoinGame(coin);
    }

    public static CardGame createCardGame(Deck deck) {
        return new CardGame(deck);
    }

    public static DiceGame createDiceGame(Die die) {
        return new DiceGame(die);
    }
}
