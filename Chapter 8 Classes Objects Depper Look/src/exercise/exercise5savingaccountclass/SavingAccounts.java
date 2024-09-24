package exercise.exercise5savingaccountclass;

public class SavingAccounts {
    private static double annualInterest;
    private double savingBalance;

    public SavingAccounts(double savingBalance) {
        try {
            if (savingBalance < 0) {
                throw new IllegalArgumentException("Numbers less than 0, dont accepted!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        this.savingBalance = savingBalance;
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterest = newInterestRate / 100;
    }

    public double calculateMonthlyInterest() {
        double monthlyInterest = 0;
        for (int month = 1; month <= 12; month++) {
            monthlyInterest = (savingBalance * annualInterest)/12;
            savingBalance += monthlyInterest;
        }
        return savingBalance;
    }
}
