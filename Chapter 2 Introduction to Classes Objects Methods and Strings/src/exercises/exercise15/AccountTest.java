package exercises.exercise15;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {


        // create two account object
        Account account1 = new Account("Jose Valim", 50.00);
        Account account2 = new Account("Olga Santos", -7.53);

        account1.displayAccount(account1);
        account2.displayAccount(account2);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        // display balances
        account1.displayAccount(account1);
        account2.displayAccount(account2);

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding $%.2f to account2 balance%n%n",depositAmount);
        account2.deposit(depositAmount);

        account1.displayAccount(account1);
        account2.displayAccount(account2);

    }
}
