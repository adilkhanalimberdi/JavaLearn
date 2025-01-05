package day17.task1;


public class Task1 {

    public static void main(String[] args) {
        String[] figures = {
                ChessPiece.PAWN_WHITE.getRep(), ChessPiece.PAWN_WHITE.getRep(),
                ChessPiece.PAWN_WHITE.getRep(), ChessPiece.PAWN_WHITE.getRep(),
                ChessPiece.ROOK_BLACK.getRep(), ChessPiece.ROOK_BLACK.getRep(),
                ChessPiece.ROOK_BLACK.getRep(), ChessPiece.ROOK_BLACK.getRep(),
        };

        for (String i : figures) {
            System.out.print(i + " ");
        }
    }

}
