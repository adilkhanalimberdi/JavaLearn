package day17.task1;

public enum ChessPiece {
    KING_WHITE(100, "♔"),
    KING_BLACK(100, "♚"),
    QUEEN_WHITE(9, "♕"),
    QUEEN_BLACK(9, "♛"),
    ROOK_WHITE(5, "♖"),
    ROOK_BLACK(5, "♜"),
    BISHOP_WHITE(3.5, "♗"),
    BISHOP_BLACK(3.5, "♝"),
    KNIGHT_WHITE(3, "♘"),
    KNIGHT_BLACK(3, "♞"),
    PAWN_WHITE(1, "♙"),
    PAWN_BLACK(1, "♟");
    private double value;
    private String rep;

    ChessPiece(double value, String rep) {
        this.value = value;
        this.rep = rep;
    }

    public String getRep() {
        return rep;
    }

    public double getValue() {
        return value;
    }
}
