package exercise.exercise18TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean gameStatus = false;
        Boolean gameStatusPlayer2 = false;
        Table table = new Table();
        int moves = 0;

        System.out.println("TicTacToe");

        System.out.println("Player 1 choose your piece O or X");
        Character player1 = input.next().charAt(0);

        while (!table.checkPlayerPiece(player1)) {
            player1 = fixPlayerPiece(player1, input);
        }

        while (!table.checkPlayerPiece(player1)) {
            player1 = fixPlayerPiece(player1, input);
        }

        char player2 = player1 == 'X' ? 'O' : 'X';

        Player player1Piece = new Player(player1);
        Player player2Piece = new Player(player2);


        System.out.println("When the player 1 choose your piece, player 2 will be the other piece.");

        while (!gameStatus && !gameStatusPlayer2) {
            System.out.println("TicTacToe");

            System.out.println();
            table.showTable();
            System.out.println();

            System.out.println("Enter the position X to put player 1 piece:");
            System.out.println("But remember the table has the 3x3 size.");
            int player1PositionX = input.nextInt();

            System.out.println("Enter the position Y to put player 1 piece:");
            System.out.println("But remember the table has the 3x3 size.");
            int player1PositionY = input.nextInt();

            while (!table.checkPlayerPosition(player1PositionX)) {
                player1PositionX = fixPlayerPosition(player1PositionX, input);
            }
            while (!table.checkPlayerPosition(player1PositionY)) {
                player1PositionY = fixPlayerPosition(player1PositionY, input);
            }

            boolean positionVerified = table.checkPlayPosition(player1Piece.getPlayerPiece(), player1PositionX, player1PositionY);
            int counterErrors = 0;
            while (!positionVerified) {
                player1PositionX = fixPlayerPositionMove(player1PositionX, player1Piece.getPlayerPiece(), input, counterErrors);
                player1PositionY = fixPlayerPositionMove(player1PositionY, player1Piece.getPlayerPiece(), input, counterErrors);

                while (!table.checkPlayerPosition(player1PositionX)) {
                    player1PositionX = fixPlayerPosition(player1PositionX, input);
                    counterErrors++;
                }
                while (!table.checkPlayerPosition(player1PositionY)) {
                    player1PositionY = fixPlayerPosition(player1PositionY, input);
                    counterErrors++;
                }
                positionVerified = table.checkPlayPosition(player1Piece.getPlayerPiece(), player1PositionX, player1PositionY);
            }
            table.positionate(player1Piece.getPlayerPiece(), player1PositionX, player1PositionY);

            int player2PositionX = player2Piece.automaticPlay();
            int player2PositionY = player2Piece.automaticPlay();
            positionVerified = table.checkPlayPosition(player2Piece.getPlayerPiece(), player2PositionX, player2PositionY);
            while (!positionVerified) {
                player2PositionX = player2Piece.automaticPlay();
                player2PositionY = player2Piece.automaticPlay();
                positionVerified = table.checkPlayPosition(player2Piece.getPlayerPiece(), player2PositionX, player2PositionY);
            }
            table.positionate(player2Piece.getPlayerPiece(), player2PositionX, player2PositionY);

            table.showTable();

            gameStatus = table.checkDraw(moves++);
            if (gameStatus) {
                System.out.println(table.showDrawMessage());
            }

            gameStatus = table.checkWin(player1);
            gameStatusPlayer2 = table.checkWin(player2);
            if (gameStatus || gameStatusPlayer2) {
                if (gameStatus) {
                    System.out.println(table.showWin(player1Piece.getPlayerPiece()));
                } else {
                    System.out.println(table.showWin(player2Piece.getPlayerPiece()));
                }
            }
        }
    }

    public static Character fixPlayerPiece(Character player, Scanner input) {
        char newPlayerPiece;

        System.out.println("This option player is not permmited");
        System.out.println("Enter the option again");
        newPlayerPiece = input.next().charAt(0);

        return newPlayerPiece;
    }

    public static Integer fixPlayerPosition(Integer playerPosition, Scanner input) {
        int newPlayerPosition;

        System.out.println("This option player position is not permmited");
        System.out.println("Enter the position again");
        newPlayerPosition = input.nextInt();

        return newPlayerPosition;
    }

    public static Integer fixPlayerPositionMove(int playerPosition, char playerPiece, Scanner input, int counterErrors) {
        int newPlayer1Position = 0;
        if (counterErrors % 2 == 0) {
            System.out.println("Already exist a piece in this position!");
            System.out.println("Enter a new position X:");
        } else {
            System.out.println("Enter new position Y");
        }
        newPlayer1Position = input.nextInt();

        return newPlayer1Position;
    }

    public static Boolean checkFinishOption(Character finishOption) {
        return finishOption.equals('Y') || finishOption.equals('N');
    }

    public static Boolean checkGameStatus(Character finishOption) {
        return finishOption != 'Y';
    }

}
