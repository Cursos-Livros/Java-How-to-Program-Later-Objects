package exercises.exercise1;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // create two account object
        Account account1 = new Account("Jose Valim", 50.00);
        Account account2 = new Account("Olga Santos", -7.53);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        // display balances
        System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding $%.2f to account2 balance%n%n",depositAmount);
        account2.deposit(depositAmount);

        System.out.print("Enter amount withdraw for account2: ");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%nsubtracting $%.2f to account2 balance%n%n",withdrawAmount);
        account2.withdraw(withdrawAmount);

        System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(), account2.getBalance());

    }
}
