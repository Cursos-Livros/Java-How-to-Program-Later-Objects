package exercises.exercise18;

import java.util.Locale;
import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number account:");
        int numberAccount = input.nextInt();

        System.out.println("Enter the balance of begin of month:");
        double balanceBeginMonth = input.nextDouble();

        System.out.println("Enter number of items charged:");
        double itemChargedMonth = input.nextDouble();

        System.out.println("Enter the total credit spend:");
        double creditSpend = input.nextDouble();

        System.out.println("Enter the total credit:");
        double totalCredit = input.nextDouble();

        CreditLimit creditLimitCalculator = new CreditLimit(numberAccount, balanceBeginMonth, itemChargedMonth,
                creditSpend, totalCredit);

        System.out.println(creditLimitCalculator.newBalance());
    }
}
