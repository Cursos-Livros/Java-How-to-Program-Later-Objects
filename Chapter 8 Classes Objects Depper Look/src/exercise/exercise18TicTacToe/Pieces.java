package exercise.exercise18TicTacToe;

public enum Pieces {
    pieceX("X"),
    pieceO("O"),
    pieceEmpty("Empty");

    private final String piece;

    Pieces(String piece) {
        this.piece = piece;
    }

    public String getPiece() {
        return piece;
    }
}
