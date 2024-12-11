package exercises.exercise16;

public class CompensationModelBasePlusCommission extends CompensationModel{
    public CompensationModelBasePlusCommission(double baseSalary, double grossSales, double commisionRates) {
        super(baseSalary, grossSales, commisionRates);
    }

    public double earnings() {
        return (grossSales * commissionRates) + baseSalary;
    }
}
