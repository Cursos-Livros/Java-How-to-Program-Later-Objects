package exercise22;

import java.security.SecureRandom;

// Quando estiver trabalhando com matrizes, pense em:
// Tabelas → linha primeiro, depois coluna


public class KnightsTour {
    public static void main(String[] args) {
        run();
    }

    public static void run() {

        int[][] chessboard = new int[8][8];
        int[] horizontalMove = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] verticalMove = {-1, -2, -2, -1, 1, 2, 2, 1};
        int currentRow = 0;
        int currentColumn = 0;
        int knight = 1;

        chessboard[currentRow][currentColumn] = knight;

        boolean moved;

        // Counter if knight touch 64 squares
        while (knight < 64) {
            moved = false;

            for (int move = 0; move < chessboard.length; move++) {
                int nextRow = currentRow + getVerticalMove(verticalMove, move);
                int nextColumn = currentColumn + getHorizontalMove(horizontalMove, move);

                if (isPossible(chessboard, nextRow, nextColumn)) {
                    currentRow = nextRow;
                    currentColumn = nextColumn;
                    knight++;
                    realizeMovement(chessboard, currentRow, currentColumn, knight);
                    moved = true;
                    break;
                }
            }

            // Control to verify if has not any movement
            if (!moved) {
                break;
            }

        }
        showBoard(chessboard);
        showStatus(knight);
    }

    public static boolean maximumMove(int playNumber) {
        return playNumber > 64;
    }

    public static int getHorizontalMove(int[] horizontalMove, int typeMove) {
        return horizontalMove[typeMove];
    }

    public static int getVerticalMove(int[] verticalMove, int typeMove) {
        return verticalMove[typeMove];
    }

    public static boolean isPossible(int[][] chessboard, int currentRow, int currentColumn) {
        return ((currentRow >= 0 && currentRow < chessboard.length) && (currentColumn >= 0 && currentColumn < chessboard.length) && (chessboard[currentRow][currentColumn] == 0));
    }

    public static void realizeMovement(int[][] chessboard, int currentRow, int currentColumn, int knight) {
        chessboard[currentRow][currentColumn] = knight;
    }

    public static void showBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.println();
        }
    }

    public static void showStatus(int numberPlays) {
        System.out.printf("the knight complete %d tours!", numberPlays);
    }
}

