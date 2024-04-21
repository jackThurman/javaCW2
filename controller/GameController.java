package java.controller;
import java.games.Coin;
import java.games.Deck;
import java.games.Die;
import java.games.GameInterface;
import java.io.*;

public class GameController {

    private static GameController instance = null;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private GameController() {
    }

    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }

    public GameInterface createGame(String gameType) {
        switch (gameType.toLowerCase()) {
            case "coin":
                Coin coin = new Coin();
                return GameFactory.createCoinGame(coin);
            case "card":
                Deck deck = new Deck();
                return GameFactory.createCardGame(deck);
            case "dice":
                Die die = new Die();
                return GameFactory.createDiceGame(die);
            default:
                return null;
        }
    }

    public void run() throws Exception {

        System.out.print("Choose a game (coin, card, dice): ");
        String choice = br.readLine();
        GameInterface game = createGame(choice);
        if (game != null) {
            game.initializeGame();
            game.playGame(br);
            game.declareWinner();
        } else {
            System.out.println("Invalid game type selected.");
        }
    }

    public static void main(String[] args) throws Exception{
        GameController controller = GameController.getInstance();
        controller.run();
    }
}
