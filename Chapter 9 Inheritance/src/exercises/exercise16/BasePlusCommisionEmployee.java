package exercises.exercise16;

import exercises.exercise14.Employee;

public class BasePlusCommisionEmployee extends Employee {
    private Double baseSalary;
    private Double grossSales; // gross weekly sales
    private Double commissionRates; // commission percentage

    public BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                     double grossSales, double commissionRates, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >=0");
        }

        if (commissionRates <= 0.0 || commissionRates >= 1.0) {
            throw new IllegalArgumentException("Gross sales must be > 0.0 and < 1.0");
        }

        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >=0.0");
        }
        this.grossSales = grossSales;
        this.commissionRates = commissionRates;
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        CompensationModel compensationModelCommission = new CompensationModelBasePlusCommission(baseSalary,
                grossSales, commissionRates);
        return compensationModelCommission.earnings();
    }

    public String toString() {
        return String.format("%s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                super.toString(),
                "base salary", baseSalary,
                "gross sales", grossSales,
                "commission rate", commissionRates);
    }
}
