package exercise.exercise18TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean gameStatus = false;
        Table table = new Table();
        int moves = 0;

        System.out.println("TicTacToe");

        System.out.println();
        table.showTable();
        System.out.println();

        System.out.println("Player 1 choose your piece O or X");
        Character player1 = input.next().charAt(0);

        while (!gameStatus) {
            System.out.println("TicTacToe");

            System.out.println();
            table.showTable();
            System.out.println();

            while (!table.checkPlayerPiece(player1)) {
                player1 = fixPlayerPiece(player1, input);
            }

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

            table.positionate(player1, player1PositionX, player1PositionY);
            table.showTable();

            gameStatus = table.checkDraw(moves++);
            if (gameStatus) {
                System.out.println(table.showDrawMessage());
                gameStatus = true;
            }
            gameStatus = table.checkWin(player1);
            if (gameStatus) {
                System.out.println(table.showWin());
                gameStatus = true;
            }
        }
    }

    public static Character fixPlayerPiece(Character player, Scanner input) {
        Character newPlayerPiece;

        System.out.println("This option player is not permmited");
        System.out.println("Enter the option again");
        newPlayerPiece = input.next().charAt(0);

        return newPlayerPiece;
    }

    public static Integer fixPlayerPosition(Integer playerPosition, Scanner input) {
        Integer newPlayerPosition;

        System.out.println("This option player position is not permmited");
        System.out.println("Enter the position again");
        newPlayerPosition = input.nextInt();

        return newPlayerPosition;
    }

    public static Boolean checkFinishOption(Character finishOption) {
        return finishOption.equals('Y') || finishOption.equals('N');
    }

    public static Boolean checkGameStatus(Character finishOption) {
        return finishOption == 'Y' ? false : true;
    }

}
