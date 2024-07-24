package exercise;

import java.util.Scanner;

public class exercise15hypotenusecalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double triangle1 = hipotenuseCalculator(input);
        double triangle2 = hipotenuseCalculator(input);
        double triangle3 = hipotenuseCalculator(input);

        System.out.println("the hipotenuse of triangle 1 is:");
        System.out.println(triangle1);

        System.out.println("the hipotenuse of triangle 2 is:");
        System.out.println(triangle2);

        System.out.println("the hipotenuse of triangle 3 is:");
        System.out.println(triangle3);

        input.close();
    }

    public static double hipotenuseCalculator(Scanner input) {
        System.out.println("Enter the value of side 1:");
        double side1 = sideInput(input);

        System.out.println("Enter the value of side 2:");
        double side2 = input.nextDouble();

        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public static double sideInput(Scanner input) {
        double side = input.nextDouble();
        return sideLess0Test(input, side);
    }


    public static double sideLess0Test(Scanner input, double sideValue) {
        if (sideValue <= 0) {
            return sideLess0Fix(input, sideValue);
        }
        return sideValue;
    }

    public static double sideLess0Fix(Scanner input, double side) {
        double sidetoFix = side;

        while (sidetoFix <= 0) {
            System.out.println("The value cannot be less than 0!");
            System.out.println("Enter the value of triangle again:");
            sidetoFix = input.nextDouble();
        }
        return sidetoFix;
    }

}
