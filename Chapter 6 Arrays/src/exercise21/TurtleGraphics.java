package exercise21;

import java.util.Scanner;

public class TurtleGraphics {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner input = new Scanner(System.in);

        System.out.println("You are in the position (0,0):");
        System.out.println("Enter with a direction:");
        int currentDirection = chooseDirection(input);
        showCurretDirection(currentDirection);

        System.out.println();
    }

    public static int chooseDirection(Scanner input) {

        int direction = input.nextInt();

        while (!testDirection(direction)) {
            System.out.println("The direction is out of range:");
            System.out.println("Enter the direction again!");
            System.out.printf("1 = Right ↑\n");
            System.out.printf("2 = Left →\n");
            direction = input.nextInt();
        }

        return direction - 1;
    }

    public static boolean testDirection(int direction) {
        return direction >= 1 && direction <= 4;
    }

    public
}
