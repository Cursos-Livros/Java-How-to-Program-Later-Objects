package exercise.exercise3;

import java.util.Scanner;

public class CylinderClassTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Volume Cylinder Calculator");
        System.out.println("Enter the radius");
        double radius = input.nextDouble();

        System.out.println("Enter the height");
        double height = input.nextDouble();

        CylinderClass cylinder = new CylinderClass(radius, height);

        System.out.println("Cylinder Volume: " + cylinder.volume());
    }
}
