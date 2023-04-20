package Problems.Chess.Pieces;

import Problems.Chess.Position;

public interface Piece {
    Boolean isValidMove(int row , int col);
    void makeMove(Position p , int  row ,int col);
}
