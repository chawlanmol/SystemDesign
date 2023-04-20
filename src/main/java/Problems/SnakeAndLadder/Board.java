package Problems.SnakeAndLadder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

    Map<Integer, Cell> cellMap;

    public Map<Integer, Cell> getCellMap() {
        return cellMap;
    }

    public void setCellMap(Map<Integer, Cell> cellMap) {
        this.cellMap = cellMap;
    }

    public Board(Integer cells) {
        cellMap = new HashMap<>();
        for(int i = 0 ; i < cells; i++) {
            Cell cell = new Cell(i+1);
            cellMap.put(i+1, cell);
        }
        this.setSnake(100,50);
        this.setSnake(35, 10);
        this.setSnake(34, 10);
        this.setSnake(33, 10);

    }

    private void setSnake(Integer cellId, Integer decrement) {
        Cell cell = cellMap.get(cellId);
        cell.setHasSnake(true);
        cell.setSnakeDecrement(decrement);
    }
}
