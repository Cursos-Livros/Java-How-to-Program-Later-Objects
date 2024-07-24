package exercise;

import java.util.Scanner;

public class Exercise28GretestCommomDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number 1:");
        int number1 = input.nextInt();
        System.out.println("Enter a number 1:");
        int number2 = input.nextInt();

        euclidAlgorithm(number1, number2);
    }

    public static void euclidAlgorithm(int number1, int number2) {
        int rest = 1;
        int dividend = number1;
        int divisor = number2;

        // recebe o resto da divisao do dividendo e o divisor
        // passa o divisor para o dividendo
        // divisor passa a ser o resto
        while (rest != 0) {
            rest = dividend % divisor;
            dividend = divisor;
            divisor =  rest;
        }

        System.out.println(dividend);
    }
}
