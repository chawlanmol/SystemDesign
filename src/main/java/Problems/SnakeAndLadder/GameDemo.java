package Problems.SnakeAndLadder;

import Problems.SnakeAndLadder.Dice.IDice;
import Problems.SnakeAndLadder.Dice.SimpleDice;

public class GameDemo {


    public void Demo() {
        User user1 = new User();
        user1.setUserName("Anmol");
        user1.setCurrentCell(new Cell(1));
        user1.setIsFinished(false);

        User user2 = new User();
        user2.setUserName("Harshita");
        user2.setCurrentCell(new Cell(1));
        user2.setIsFinished(false);



        IDice dice = new SimpleDice();

        Game game = new Game(user1, user2,dice);
        while (user1.getIsFinished() != true && user2.getIsFinished() != true) {
            game.makeMove();
        }

    }
}
