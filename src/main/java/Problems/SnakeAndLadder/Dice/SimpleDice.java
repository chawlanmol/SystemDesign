package Problems.SnakeAndLadder.Dice;

import java.util.Random;

public class SimpleDice implements IDice {
    Random rand = new Random();

    public Integer rollDice() {
        return  1 + rand.nextInt(5);
    }
}
