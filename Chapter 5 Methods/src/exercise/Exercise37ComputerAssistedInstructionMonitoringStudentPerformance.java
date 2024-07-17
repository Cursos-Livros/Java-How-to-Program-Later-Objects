package exercise;

import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise37ComputerAssistedInstructionMonitoringStudentPerformance {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        Scanner input = new Scanner(System.in);

        System.out.println("Choose the difficulty");
        System.out.println("1 for integer 1 digit:");
        System.out.println("2 for integer 2 digit:");
        int difficultyOption = input.nextInt();

        while (!checkDifficulty(difficultyOption)) {
            difficultyOption = difficultyError(input);
            checkDifficulty(difficultyOption);
        }

        int number1 = 0;
        int number2 = 0;

        if (difficultyOption == 1) {
            number1 = randomNumbers1Digit(randomNumbers);
            number2 = randomNumbers1Digit(randomNumbers);
        }else{
            number1 = randomNumbers2Digit(randomNumbers);
            number2 = randomNumbers2Digit(randomNumbers);
        }


        System.out.println("How much is " + number1 + " times " + number2);

        int answer = 0;
        int countError = 0;
        int countRight = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the answer");
            answer = input.nextInt();
            if (!checkAnswer(number1, number2, answer)) {
                chaterringError();
                countError++;
            } else {
                countRight++;
                chaterringRight();
                break;
            }
        }

        report(countRight, countError);

        input.close();
    }

    public static boolean checkDifficulty(int difficultOption) {
        return difficultOption == 1 || difficultOption == 2;
    }

    public static int difficultyError(Scanner input) {
        System.out.println("Enter the option difficult again:");
        int option = input.nextInt();

        return option;
    }

    public static int randomNumbers1Digit(SecureRandom randomNumbers) {
        return 1 + randomNumbers.nextInt(9);
    }

    public static int randomNumbers2Digit(SecureRandom randomNumbers) {
        return 10 + randomNumbers.nextInt(100);
    }

    public static boolean checkAnswer(int number1, int number2, int answer) {
        return (number1 * number2) == answer;
    }

    public static void chaterringError() {
        SecureRandom randomNumbers = new SecureRandom();
        int randomFeedback = 1 + randomNumbers.nextInt(4);

        switch (randomFeedback) {
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

        switch (randomFeedback) {
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

    public static void report(int countRight, int countError) {
        double percetageError = ((double) countError / 10) * 100;

        if (percetageError >= 75.0) {
            System.out.println("Please ask your teacher for extra help.");
        } else {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
    }
}

