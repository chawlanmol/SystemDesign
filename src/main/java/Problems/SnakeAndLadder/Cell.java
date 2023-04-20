package Problems.SnakeAndLadder;

public class Cell {
    private Integer cellId;
    private Boolean hasSnake;
    private Integer snakeDecrement;

    public Boolean getHasSnake() {
        return hasSnake;
    }

    public void setHasSnake(Boolean hasSnake) {
        this.hasSnake = hasSnake;
    }

    public Integer getSnakeDecrement() {
        return snakeDecrement;
    }

    public void setSnakeDecrement(Integer snakeDecrement) {
        this.snakeDecrement = snakeDecrement;
    }

    public Integer getCellId() {
        return cellId;
    }

    public Cell(Integer cellId) {
        this.cellId = cellId;
    }
}
