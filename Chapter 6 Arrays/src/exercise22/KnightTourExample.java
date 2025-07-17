package exercise22;

public class KnightTourExample {
    public static void main(String[] args) {
        int[][] board = new int[5][5];
        int knight = 1;

        int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

        int row = 0;
        int column = 0;
        board[row][column] = knight;
        int[] nextMove = new int[2];

        for (int i = 0; i < 50; i++) {
                nextMove = getNextMove(horizontal, vertical, row, column, knight, board);

            if (nextMove != null) {
                row = nextMove[0];
                column = nextMove[1];
                knight++;
                board[nextMove[0]][nextMove[1]] = knight;
            } else {
                System.out.println("It's not possible more movements");
            }
        }
        showBoard(board);
    }

    public static int[] getNextMove(int[] horizontal, int[] vertical, int row, int column, int knight, int[][] board) {
        // From the current position generates a new types of movements
        for (int i = 0; i < horizontal.length; i++) {
            int newRow = row + vertical[i];
            int newColumn = column + horizontal[i];

            // Just move if this rules its corrects
            if ((newRow >= 0 && newRow < board.length) && (newColumn >= 0 && newColumn < board.length) && board[newRow][newColumn] == 0) {
                return new int[]{newRow, newColumn};
            }
        }

        return null; // it's a impossible moviment
    }

    public static void showBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.printf("%d   ", board[i][j]);
            }
            System.out.println();
        }
    }
}

