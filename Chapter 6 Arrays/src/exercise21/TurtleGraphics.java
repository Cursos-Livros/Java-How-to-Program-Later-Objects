package exercise21;

import java.util.Scanner;

public class TurtleGraphics {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner input = new Scanner(System.in);
        int[][] floor = new int[20][20];
        int currentCommand = 0;
        int currentDirection = 0;
        int currentPositionY = 0;
        int currentPositionX = 0;
        int penStatus = 0;
        char turtle = 'T';
        int exit = 0;

        while (exit == 0) {
            System.out.println("Menu");
            showMenu();

            currentCommand = commandOption(input, currentCommand);

            switch (currentCommand) {
                case 1:
                    penStatus = penUp();
                    break;
                case 2:
                    penStatus = penDown();
                    break;
                case 3:
                    currentDirection = turnRight(currentDirection);
                    break;
                case 4:
                    currentDirection = turnLeft(currentDirection);
                    break;
                case 5:
                    moveFoward(currentDirection, currentPositionY, currentPositionX, floor);
                    break;
                case 6:
                    showFloor(floor);
                    break;
                case 9:
                    exit = 1;
                    break;
            }
        }


    }

    public static void showMenu() {
        System.out.print("Command   Meaning \n");
        System.out.print("  1         Pen up \n");
        System.out.print("  2         Pen down \n");
        System.out.print("  3         Turn right\n");
        System.out.print("  4         Turn left \n");
        System.out.print("  5         Move forward \n");
        System.out.print("  6         Show floor\n");
        System.out.print("  9         End of data\n");
    }

    public static int commandOption(Scanner input, int currentCommand) {
        System.out.println("Enter with the command option:");
        currentCommand = input.nextInt();

        while (!checkCommandOption(currentCommand)) {
            System.out.println("This option" + currentCommand + "is not allowed.");
            showMenu();
            System.out.println("Enter with one of this options again:");
            currentCommand = input.nextInt();
        }

        return currentCommand;
    }

    public static boolean checkCommandOption(int currentCommand) {
        return currentCommand >= 1 && currentCommand <= 6 || currentCommand == 9;
    }

    public static int penUp() {
        return 1;
    }

    public static int penDown() {
        return 0;
    }

    public static int turnRight(int currentDirection) {
        return (currentDirection + 1) % 4; // Modular Aritmethic
    }

    public static int turnLeft(int currentDirection) {
        return (currentDirection - 1 + 4) % 4;
    }

    public static void moveFoward(int currentDirection, int currentPositionX, int currentPositionY, int[][] floor) {
        int tempX = currentPositionX;
        int tempY = currentPositionY;
        switch (currentDirection) {
            case 1, 3:
                floor[tempX++][currentPositionY] = 1;
                break;
            case 2, 4:
                floor[currentPositionX][currentPositionY++] = 1;
                break;
        }
    }

    public static void showFloor(int[][] floor) {

        for (int i = 0; i < floor.length; i++) {
            for (int j = 0; j < floor[i].length; j++) {
                System.out.printf(floor[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
