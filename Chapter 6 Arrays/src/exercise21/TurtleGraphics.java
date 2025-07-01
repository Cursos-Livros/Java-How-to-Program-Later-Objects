package exercise21;

import java.util.Scanner;

public class TurtleGraphics {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner input = new Scanner(System.in);
        int[][] floor = new int[20][20];
        int currentDirection = 0;
        int exitOption = 1;

        while (!exit(exitOption)) {
            showFloor(floor);
            System.out.printf("You are in the position (%d,%d): %n", floor[0][0], floor[0][0]);
            System.out.println("and your direction is: " + showCurretDirection(currentDirection));

            System.out.println("Enter with a direction:");
            int newDirection = chooseDirection(input);
            currentDirection = changeDirection(newDirection, currentDirection);
            System.out.println("Your new direction is: " + showCurretDirection(currentDirection));


            System.out.println("Continue:");
            exitOption = input.nextInt();
        }
        System.out.println();
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

    public static int changeDirection(int newDirection, int currentDirection) {
        return newDirection == 0 ? (currentDirection + 1) % 4 : (currentDirection - 1 + 4) % 4; // Modular Aritmethic
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

    public static void showFloor(int[][] floor) {

        for (int i = 0; i < floor.length; i++) {
            for(int j=0; j< floor.length; j++){
                System.out.printf(floor[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
