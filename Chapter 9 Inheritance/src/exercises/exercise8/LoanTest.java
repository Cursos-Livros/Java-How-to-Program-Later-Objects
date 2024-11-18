package exercises.exercise8;

import java.util.Scanner;

public class LoanTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount value:");
        double amountValue = input.nextDouble();
        System.out.println("Enter the tenure value:");
        int tenure = input.nextInt();

        HomeLoan homeLoan = new HomeLoan(amountValue, tenure);

        System.out.println(homeLoan);

    }
}
