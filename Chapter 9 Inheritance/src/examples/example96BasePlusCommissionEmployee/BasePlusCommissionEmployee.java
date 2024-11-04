package examples.example96BasePlusCommissionEmployee;

// BasePlusCommissionEmployee class represents an employee who receives
// a base salary in addition to commission.

import examples.example94commisionemployee.CommissionEmployee;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRates, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRates);

        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >=0");
        }

        if (commissionRates <= 0 || commissionRates >= 1.0) {
            throw new IllegalArgumentException("Gross sales must be > 0.0 and < 1.0");
        }

        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >=0.0");
        }

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

    @Override
    public double earnings() {
        return getBaseSalary() + (super.earnings());
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried",
                super.toString(), "base salary", getBaseSalary());
    }
}
