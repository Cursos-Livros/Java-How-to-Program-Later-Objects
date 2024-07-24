package exercise;

import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise35ComputerAssistedInstruction {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        Scanner input = new Scanner(System.in);

        int number1 = 1 + randomNumbers.nextInt(10);
        int number2 = 1 + randomNumbers.nextInt(10);

        System.out.println("How much is " + number1 + " times " + number2);
        boolean answear = checkAnswear(number1, number2, input);

        if (!answear) {
            errorAnswear(number1, number2, input);
        } else{
            rightAnswear();
        }

        input.close();
    }

    public static boolean checkAnswear(int number1, int number2, Scanner input) {
        System.out.println("Enter the answear");
        int answear = input.nextInt();

        return (number1 * number2) == answear;
    }

    public static boolean errorAnswear(int number1, int number2, Scanner input) {
        boolean status = false;

        while (!status) {
            System.out.println("No. Please try again.");
            status = checkAnswear(number1, number2, input);
        }
        return status;
    }

    public static void rightAnswear(){
        System.out.println("Very good!");
    }
}
