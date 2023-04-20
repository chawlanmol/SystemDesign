package Problems.SnakeAndLadder;

import Problems.SnakeAndLadder.Dice.IDice;

import java.util.LinkedList;
import java.util.Queue;

public class Game {

    Queue<User> players = new LinkedList<>();
    Board board;
    IDice dice;

    public Game(User user1, User user2, IDice dice) {
        players.add(user1);
        players.add(user2);
        this.dice = dice;
        board = new Board(100);
    }

    public void makeMove() {
        User userTurn = players.remove();
        Integer diceCount = dice.rollDice();
        System.out.println("User turn:" + userTurn.getUserName());
        System.out.println("User Dice:" + diceCount);


        Cell currentCell = userTurn.getCurrentCell();
        Integer newCellId = currentCell.getCellId() + diceCount;

        if(newCellId > board.getCellMap().size()) {
            System.out.println("User has finished");
            userTurn.setIsFinished(true);
        } else {
            System.out.println("User currentCell:" + newCellId);
            Cell newCell = board.getCellMap().get(newCellId);
            if(newCell.getHasSnake() != null && newCell.getHasSnake() == true) {
                newCellId = newCellId - newCell.getSnakeDecrement();
                if(newCellId < 1) newCellId = 1;
                newCell = board.getCellMap().get(newCellId);
                System.out.println("SNAKE BITE:" + newCellId);
            }
            userTurn.setCurrentCell(newCell);
            players.add(userTurn);
        }
        System.out.println();
        System.out.println();

    }

}
