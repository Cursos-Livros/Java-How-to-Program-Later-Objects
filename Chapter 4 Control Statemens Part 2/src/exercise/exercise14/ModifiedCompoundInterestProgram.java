package exercise.exercise14;

public class ModifiedCompoundInterestProgram {
    public static void main(String[] args) {
        double principal = 1000.0; // initial amount before interest
        double rate = 0; // interest rate

        // display headers
        System.out.printf("%s %n", "Year", "Amount on deposit");

        for (int i = 5; i < 10; i++) {
            rate = (double) i / 100;
            // calculate amount on deposit for each of ten years
            for (int year = 1; year <= 10; ++year) {
                // calculate new amount on deposit for specified year
                double amount = principal * Math.pow(1.0 + rate, year);
                // display the compund interest value
                // display the year and the amount
                System.out.printf("%4d%,20.2f%n", year, amount);
            }
            System.out.println();
        }
    }
}

