package java.games;
import java.util.*;

public class Die {
    public Side state;

    public static enum Side {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX
    }

    public Die() {
        state = Side.ONE;
    }

    public void roll() {

        Side[] values = Side.values();
        Random random = new Random();
        int randomIndex = random.nextInt(values.length);
        Side newSide = Side.values()[randomIndex];
        state = newSide;
    }   

    public void display() {
        System.out.println("You rolled a " + state);
    }
}
