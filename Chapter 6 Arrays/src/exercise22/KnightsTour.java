package exercise22;

import java.security.SecureRandom;

// Quando estiver trabalhando com matrizes, pense em:
// Tabelas → linha primeiro, depois coluna


public class KnightsTour {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        SecureRandom typeOption = new SecureRandom();

        int[][] chessboard = new int[8][8];
        int[] horizontalMove = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] verticalMove = {-1, -2, -2, -1, 1, 2, 2, 1};
        int currentRow = 0;
        int currentColumn = 0;
        int counter = 1;

        int typoMove = typeOption.nextInt(7);

        currentRow += getHorizontalMove(horizontalMove, typoMove);
        currentColumn += getVerticalMove(verticalMove, typoMove);

        while (!isPossible(chessboard, currentRow, currentColumn, counter)) {
            currentRow += getHorizontalMove(horizontalMove, typoMove);
            currentColumn += getVerticalMove(verticalMove, typoMove);
        }
        realizeMovement(chessboard, currentRow, currentColumn, counter);
        counter++;


    }

    public static int getHorizontalMove(int[] horizontalMove, int typeMove) {
        return horizontalMove[typeMove];
    }

    public static int getVerticalMove(int[] verticalMove, int typeMove) {
        return verticalMove[typeMove];
    }

    public static boolean isPossible(int[][] chessboard, int currentRow, int currentColumn, int counter) {
        if (currentRow < 0 || currentRow > chessboard.length) {
            return false;
        }

        if (currentColumn < 0 || currentColumn > chessboard.length) {
            return false;
        }

        return chessboard[currentRow][currentColumn] != 0;
    }

    public static void realizeMovement(int[][] chessboard, int currentRow, int currentColumn, int counter) {
        chessboard[currentRow][currentColumn] = counter;
    }
}

