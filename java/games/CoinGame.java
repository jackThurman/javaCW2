package java.games;
import java.io.*;

public class CoinGame implements GameInterface {
    private Coin coin;
    private int headsCount;
    private int tailsCount;

    public CoinGame(Coin coin) {
        this.coin = coin;
    }
    
    @Override
    public void initializeGame() {
        headsCount = 0;
        tailsCount = 0;
        System.out.println("Coin game initialized.");
    }

    // Pass the buffered reader in through game controller
    @Override
    public void playGame(BufferedReader reader) throws Exception {

        for (int i=0; i<4; i++) {
            System.out.println("Hit <RETURN> to flip the coin");
            reader.readLine();
            String coinState = coin.flip();
            if (coinState == "Tail"){
                tailsCount++;
            } else {
                headsCount++;
            }
            System.out.println("Your coin landed with " + coinState + " facing up");
          }
    }

    @Override
    public void declareWinner() {
        
        // If the coin landed heads up at least three times, the person won; otherwise (s)he lost
        System.out.println("You got " + headsCount + " heads and " + tailsCount + " tails");
        if (headsCount >= 3)
            System.out.println("You won, because you had three heads or more");
        else
            System.out.println("You lost, because you had fewer than three heads");
  }
}
