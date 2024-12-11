package exercises.exercise16;

import exercises.exercise14.Employee;

public class CommisionEmployee extends Employee {
    private double grossSales; // gross weekly sales
    private double commissionRates; // commission percentage

    public CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, Double grossSales,
                             Double commisionRates) {
        super(firstName, lastName, socialSecurityNumber);
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        if (commisionRates <= 0 || commisionRates >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.grossSales = grossSales;
        this.commissionRates = commisionRates;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRates(double commissionRates) {
        if (commissionRates <= 0.0 || commissionRates >= 1.0) {
            throw new IllegalArgumentException("Commision rate must be 0.0 and 1.0");
        }
        this.commissionRates = commissionRates;
    }

    public double getCommissionRates() {
        return commissionRates;
    }

    public double earnings() {
        CompensationModel commissionEmployeeCompensation = new CompensationModelCommision(grossSales, commissionRates);
        return commissionEmployeeCompensation.earnings();
    }

    public String toString() {
        return String.format("%s%n%s: %.2f%n%s: %.2f",
                super.toString(),
                "gross sales", grossSales,
                "commission rate", commissionRates);
    }
}
