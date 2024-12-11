package exercises.exercise16;

public class CompensationModelCommision extends CompensationModel{
    public CompensationModelCommision(double grossSales, double commissionRates) {
        super(grossSales, commissionRates);
    }

    @Override
    public double earnings() {
        return (commissionRates * grossSales) + baseSalary;
    }
}
