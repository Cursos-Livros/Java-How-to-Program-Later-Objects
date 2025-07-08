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
        int currentPositionX = 0
        int exitOption = 1;
        int penStatus = 0;
        char turtle = 'T';


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
                moveFoward(currentDirection, currentPositionX, currentPositionY, floor);
                break;
        }

//            showFloor(floor);
//            System.out.printf("You are in the position (%d,%d): %n", floor[0][0], floor[0][0]);
//            System.out.println("and your direction is: " + showCurretDirection(currentDirection));
//
//            System.out.println("Enter with a direction:");
//            int newDirection = chooseDirection(input);
//            currentDirection = changeDirection(newDirection, currentDirection);
//            System.out.println("Your new direction is: " + showCurretDirection(currentDirection));
//
//            System.out.println("You desire turn on the pen?");
//            penStatus = penOption(penStatus, input);
//
//            System.out.println("Continue:");

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
        return 1;
    }

    public static void moveFoward(int currentDirection, int currentPositionX, int currentPositionY, int[][] floor) {

    }

    public static boolean exit(int exitOption) {
        return exitOption == 0;
    }

    public static int chooseDirection(Scanner input) {

        int direction = input.nextInt();

        while (!testDirection(direction)) {
            System.out.println("The direction is out of range:");
            System.out.println("Enter the direction again!");
            System.out.print("1 = Right → \n");
            System.out.print("2 = Left ← \n");
            direction = input.nextInt();
        }

        return direction - 1;
    }

    public static boolean testDirection(int direction) {
        return direction == 1 || direction == 2;
    }

    public static int turnRight(int currentDirection) {
        return (currentDirection + 1) % 4; // Modular Aritmethic
    }

    public static int turnLeft(int currentDirection) {
        return (currentDirection - 1 + 4) % 4;
    }

    public static String showCurretDirection(int currentDirection) {
        String direction = "";

        switch (currentDirection) {
            case 0:
                direction = "North";
                break;
            case 1:
                direction = "East";
                break;
            case 2:
                direction = "South";
                break;
            case 3:
                direction = "West";
                break;
        }

        return direction;
    }

    public static int penOption(int penStatus, Scanner input) {
        penStatus = input.nextInt();

        while (!checkPenOption(penStatus)) {
            System.out.println("This option " + penStatus + "it's not permmited");
            System.out.println("Enter 1 or 0:");
            penStatus = input.nextInt();
        }
        return penStatus;
    }

    public static boolean checkPenOption(int penStatus) {
        return penStatus == 1 || penStatus == 0;
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
