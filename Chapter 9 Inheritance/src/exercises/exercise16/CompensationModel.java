package exercises.exercise16;

public class CompensationModel {
    double baseSalary;
    double grossSales;
    double commissionRates;

    public CompensationModel(double grossSales, double commissionRates) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }


        if (commissionRates <= 0 || commissionRates >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.baseSalary = baseSalary;
        this.grossSales = grossSales;
        this.commissionRates = commissionRates;
    }

    public CompensationModel(double baseSalary, double grossSales, double commissionRates) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }


        if (commissionRates <= 0 || commissionRates >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.baseSalary = baseSalary;
        this.grossSales = grossSales;
        this.commissionRates = commissionRates;
    }

    public double earningBasePlusCommision() {
        return (grossSales * commissionRates) + baseSalary;
    }

    public double earningCommisionCompensationModel() {
        return commissionRates * grossSales;
    }
}
