package exercises.exercise8;

public class HomeLoan extends Loan {
    double interestHomeLoanRate;

    public HomeLoan(double amount, int tenure) {
        super(amount, tenure);
        super.setInterestRate(0.03);
    }


    @Override
    public String toString() {
        return String.format("%s %n%s", "Home Loan", super.toString());
    }
}
