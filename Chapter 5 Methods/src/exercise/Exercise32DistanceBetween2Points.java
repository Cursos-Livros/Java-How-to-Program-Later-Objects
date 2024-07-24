package exercise;

import java.util.Scanner;

public class Exercise32DistanceBetween2Points {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coordinate x1:");
        double x1 = input.nextDouble();
        System.out.println("Enter the coordinate x2:");
        double x2 = input.nextDouble();
        System.out.println("Enter the coordinate y1:");
        double y1 = input.nextDouble();
        System.out.println("Enter the coordinate y2:");
        double y2 = input.nextDouble();

        double distanceBetweenPoints = calculateDistanceBetweenPoins(x1, x2, y1, y2);

        System.out.println("the result is:" + distanceBetweenPoints);
    }

    public static double calculateDistanceBetweenPoins(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0));
    }
}
