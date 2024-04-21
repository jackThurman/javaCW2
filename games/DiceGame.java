package java.games;
import java.games.Die.Side;
import java.io.*;
import java.util.*;


public class DiceGame implements GameInterface {
    private Die die;
    private ArrayList<Side> rolls;

    public DiceGame(Die die) {
        this.die = die;
    }
    
    @Override
    public void initializeGame() {
        rolls = new ArrayList<Side>();
    }

    @Override
    public void playGame(BufferedReader br) throws Exception {
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Hit <RETURN> to roll the die");
            br.readLine();
            die.roll();
            rolls.add(die.state);
            die.display();

        }
    }

    @Override
    public void declareWinner() {
        if (rolls.contains(Side.ONE)) {
            System.out.println("You rolled a ONE.");
            System.out.println("You won the dice game!");
        } else {
            System.out.println("You didn't roll a ONE.");
            System.out.println("You lost the dice game.");
        }
    }
}
