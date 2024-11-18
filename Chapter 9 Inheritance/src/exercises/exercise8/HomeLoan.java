package exercises.exercise8;

public class HomeLoan extends Loan {
    public HomeLoan(double amount, int tenure) {
        super(amount, tenure);
        this.interestRate = 0.05;
    }

    @Override
    public String toString() {
        return String.format("%s %n%s", "Home Loan", super.toString());
    }
}
