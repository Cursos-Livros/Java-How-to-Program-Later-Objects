package exercise.exercise5savingaccountclass;

import java.util.Scanner;

public class SavingAccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Interest Rate: 4%");
        SavingAccounts saver1 = new SavingAccounts(2000);
        SavingAccounts saver2 = new SavingAccounts(3000);

        SavingAccounts.modifyInterestRate(4);

        System.out.printf("Saver 1: %.2f%n", saver1.calculateMonthlyInterest());
        System.out.printf("Saver 2: %.2f%n", saver2.calculateMonthlyInterest());

        SavingAccounts.modifyInterestRate(5);

        System.out.println();

        System.out.println("Interest Rate: 5%");
        System.out.printf("Saver 1: %.2f%n", saver1.calculateMonthlyInterest());
        System.out.printf("Saver 2: %.2f%n", saver2.calculateMonthlyInterest());
    }
}
