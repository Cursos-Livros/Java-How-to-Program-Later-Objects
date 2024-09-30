package exercise.exercise11;

import java.util.Scanner;

public class ComplexTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Complex Number Calculator:");
        System.out.println("Enter the real part:");
        double realPart = input.nextDouble();
        System.out.println("Enter the imaginary part:");
        double imaginaryPart = input.nextDouble();

        System.out.println("Complex Number Calculator:");
        System.out.println("Enter the real part:");
        double realPart2 = input.nextDouble();
        System.out.println("Enter the imaginary part:");
        double imaginaryPart2 = input.nextDouble();

        Complex complexNumber1 = new Complex(realPart, imaginaryPart);
        Complex complexNumber2 = new Complex(realPart2, imaginaryPart2);

        System.out.println(complexNumber1.addComplex(complexNumber2).toString());
        System.out.println(complexNumber1.subComplex(complexNumber2).toString());

    }
}
