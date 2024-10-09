package exercise.exercise16;

import java.util.Scanner;

public class RationalTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the second rational number:");
        System.out.println("Enter the numerator:");
        int numerator = input.nextInt();
        System.out.println("Enter the denominator:");
        int denominator = input.nextInt();

        Rational rationalNumber = new Rational(numerator, denominator);

        System.out.println("Enter the second rational number:");
        System.out.println("Enter the numerator:");
        int numerator2 = input.nextInt();
        System.out.println("Enter the denominator:");
        int denominator2 = input.nextInt();

        Rational rationalNumber2 = new Rational(numerator2, denominator2);

        String sumRationalNumber = Rational.addRationalNumber(rationalNumber.getNumerator(),
                rationalNumber.getDenominator(),
                rationalNumber2.getNumerator(), rationalNumber2.getDenominator());
        String subRationalNumber = Rational.subRationalNumber(rationalNumber.getNumerator(),
                rationalNumber.getDenominator(),  rationalNumber2.getNumerator(), rationalNumber2.getDenominator());
        String multRationalNumber = Rational.multRationalNumber(rationalNumber.getNumerator(),
                rationalNumber.getDenominator(),
                rationalNumber2.getNumerator(), rationalNumber2.getDenominator());
        String divRationalNumber = Rational.divtRationalNumber(rationalNumber.getNumerator(),
                rationalNumber.getDenominator(),
                rationalNumber2.getNumerator(), rationalNumber2.getDenominator());

        System.out.println(rationalNumber.toString());
        System.out.println(sumRationalNumber);
        System.out.println(subRationalNumber);
        System.out.println(multRationalNumber);
        System.out.println(divRationalNumber);
    }
}
