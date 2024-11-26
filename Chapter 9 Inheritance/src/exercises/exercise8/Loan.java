package exercises.exercise8;

public class Loan {
    private double amount;
    private double interestRate = 0.0;
    private int tenure;

    public Loan(double amount, int tenure) {
        this.amount = amount;
        this.tenure = tenure;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    private double monthlyInstallment() {
        double monthlyRate = interestRate / 12; // Convert annual interest rate to monthly rate
        int totalPayments = tenure * 12;       // Total number of payments in months

        // Apply the formula
        return (amount * monthlyRate * Math.pow(1 + monthlyRate, totalPayments)) /
                (Math.pow(1 + monthlyRate, totalPayments) - 1);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f%n%s: %.2f%n%s: %d%n%s: %.2f%n",
                "Amount loan value", amount,
                "Interest rate", interestRate,
                "Tenure", tenure,
                "Monthly Installment", monthlyInstallment());
    }
}
