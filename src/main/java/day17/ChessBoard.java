package day17;

import java.io.IOException;

public class ChessBoard {
    private ChessPiece[][] chessPieces;

    public ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPieces = chessPieces;
    }

    public void print() {

        try {
            if (chessPieces.length != 8 || chessPieces[0].length != 8) {
                throw new IOException();
            }

            for (int i = 0; i < chessPieces.length; i++) {
                for (int j = 0; j < chessPieces[0].length; j++) {
                    System.out.print(chessPieces[i][j]);
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Неправильная шахматная доска");
        }
    }
}



