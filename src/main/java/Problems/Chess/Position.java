package Problems.Chess;

import Problems.Chess.Pieces.Piece;

public class Position {
    int row, col;
    Piece piece;

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
        this.piece = null;
    }
}
