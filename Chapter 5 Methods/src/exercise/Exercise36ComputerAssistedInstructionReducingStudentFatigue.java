package exercise;

import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise36ComputerAssistedInstructionReducingStudentFatigue {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        Scanner input = new Scanner(System.in);

        int number1 = 1 + randomNumbers.nextInt(10);
        int number2 = 1 + randomNumbers.nextInt(10);

        System.out.println("How much is " + number1 + " times " + number2);
        boolean answear = checkAnswear(number1, number2, input);

       while(!answear) {
           answear = errorAnswear(number1, number2, input);
        }

       chaterringRight();

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
            chaterringError();
            status = checkAnswear(number1, number2, input);
        }
        return status;
    }

    public static void chaterringError() {
        SecureRandom randomNumbers = new SecureRandom();
        int randomFeedback = 1 + randomNumbers.nextInt(4);

        switch (randomFeedback){
            case 1:
                System.out.println("No. Please try again.");
                break;
            case 2:
                System.out.println("Wrong. Try once more.");
                break;
            case 3:
                System.out.println("Don't give up!");
                break;
            case 4:
                System.out.println("No. Keep trying.");
                break;
        }
    }

    public static void chaterringRight() {
        SecureRandom randomNumbers = new SecureRandom();
        int randomFeedback = 1 + randomNumbers.nextInt(4);

        switch (randomFeedback){
            case 1:
                System.out.println("Very good!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice work!");
                break;
            case 4:
                System.out.println("Keep up the good work!");
                break;
        }
    }

}

