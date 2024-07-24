package exercise;

import java.util.Scanner;

public class exercise24perfectnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 1000000000; i++) {
            checkPerfect(i);
        }

    }

    public static void checkPerfect(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            showFactors(sum);
            System.out.println();
            System.out.println("Number " + number + " is perfect!");
        }
    }

    public static void showFactors(int sum) {
        for (int i = 1; i <= sum / 2; i++) {
            if (sum % i == 0) {
                if (i < sum / 2 ) {
                    System.out.printf("%d + ", i);
                }else{
                    System.out.printf("%d ", i);
                }
            }

        }
    }
}
