package java.games;
import java.io.*;

public interface GameInterface {
    void initializeGame() throws Exception;
    void playGame(BufferedReader reader) throws Exception;
    void declareWinner() throws Exception;
}