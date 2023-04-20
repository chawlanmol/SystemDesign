package Problems.Chess.Pieces;

import Problems.Chess.PieceColor;
import Problems.Chess.Position;

public class Pawn implements Piece {
    PieceColor color;
    Boolean isAlive;
    Position position;

    public Pawn(PieceColor color, Boolean isAlive, Position position) {
        this.color = color;
        this.isAlive = isAlive;
        this.position = position;
    }

    @Override
    public Boolean isValidMove(int row, int col) {
        // check how the piece moves
        // check if new coordinates are inside the chessbox
        return true;
    }

    @Override
    public void makeMove(Position currentPos , int row, int col) {
        // check validity
        // update piece position
        // free the previous position
        // occupy current position
    }
}
