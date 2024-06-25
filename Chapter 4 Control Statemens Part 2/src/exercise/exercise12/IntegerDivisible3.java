package exercise.exercise12;

import java.util.Scanner;

public class IntegerDivisible3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = input.nextInt();

        if (number % 3 == 0) {
            System.out.println("Is divisible!");
        }else{
            System.out.println("Is not divisible!");
        }
    }
}
