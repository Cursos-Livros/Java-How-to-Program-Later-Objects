package exercise.exercise18TicTacToe;

import java.util.Scanner;

public class Table {
    String[][] table = new String[3][3];

    public Table() {
        for (int position = 0; position < table.length; position++) {
            for (int internalPosition = 0; internalPosition < table.length; internalPosition++) {
                table[position][internalPosition] = Pieces.pieceEmpty.getPiece();
            }
        }
    }

    public Boolean checkPlayerPiece(Character playerPiece) {
        if (playerPiece != 'X' && playerPiece != 'O') {
            return false;
        }
        return true;
    }

    public Boolean checkPlayerPosition(Integer playerPosition) {
        if (playerPosition < 1 || playerPosition > 3) {
            return false;
        }
        return true;
    }

    public void positionate(Character playerPiece, Integer playerPositionX, Integer playerPositionY) {
        if (playerPiece == 'X') {
            table[playerPositionX - 1][playerPositionY - 1] = Pieces.pieceX.getPiece();
        }
        if (playerPiece == 'O') {
            table[playerPositionX - 1][playerPositionY - 1] = Pieces.pieceO.getPiece();
        }
    }

    public Boolean checkWin(Character player) {
        String playerComparison = "";

        if (player == 'X') {
            playerComparison = Pieces.pieceX.getPiece();
        }
        if (player == 'O') {
            playerComparison = Pieces.pieceO.getPiece();
        }

        if (!checkRows(playerComparison) && !checkColumn(playerComparison) && !checkDiagonal(playerComparison) && !checkDiagonalInverse(playerComparison)) {
            return false;
        }

        return true;
    }

    private Boolean checkRows(String playerPiece) {
        for (int i = 0; i < table.length; i++) {
            if (table[i][0].equals(playerPiece) &&
                    table[i][1].equals(playerPiece) &&
                    table[i][2].equals(playerPiece)) {
                return true;
            }
        }
        return false;
    }

    private Boolean checkColumn(String playerPiece) {
        for (int i = 0; i < table.length; i++) {
            if (table[0][i].equals(playerPiece) &&
                    table[1][i].equals(playerPiece) &&
                    table[2][i].equals(playerPiece)) {
                return true;
            }
        }
        return false;
    }

    private Boolean checkDiagonal(String playerPiece) {
        for (int i = 0; i < table.length; i++) {
            if (table[0][0].equals(playerPiece) &&
                    table[1][1].equals(playerPiece) &&
                    table[2][2].equals(playerPiece)) {
                return true;
            }
        }
        return false;
    }

    private Boolean checkDiagonalInverse(String playerPiece) {
        for (int i = 0; i < table.length; i++) {
            if (table[0][2].equals(playerPiece) &&
                    table[1][1].equals(playerPiece) &&
                    table[2][0].equals(playerPiece)) {
                return true;
            }
        }
        return false;
    }

    public Boolean checkDraw(Integer moves){
        if(moves < 9){
            return false;
        }
        return true;
    }

    public String showWin() {
        return "Player 1 Win!";
    }

    public String showDrawMessage(){
        return "A tough battle fought to a draw!";
    }

    public void showTable() {
        System.out.println("Current Board:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (col < 2) {
                    // If the cell is empty, print a space
                    System.out.printf(" %s |", table[row][col].isEmpty() ? " " : table[row][col]);
                } else {
                    // Last cell of the row
                    System.out.printf(" %s ", table[row][col].isEmpty() ? " " : table[row][col]);
                }
            }
            if (row < 2) {
                System.out.println("\n" + generateRowSeparator()); // Print dynamic row separator
            }
        }
        System.out.println(); // Extra line after board
    }

    private String generateRowSeparator() {
        StringBuilder separator = new StringBuilder();
        for (int col = 0; col < 3; col++) {
            if (table[0][col].isEmpty()) {
                separator.append("   ");  // Longer separator for empty cells
            } else {
                separator.append(" ----- ");  // Standard separator for filled cells
            }
            if (col < 2) {
                separator.append("+");
            }
        }
        return separator.toString();
    }
}
