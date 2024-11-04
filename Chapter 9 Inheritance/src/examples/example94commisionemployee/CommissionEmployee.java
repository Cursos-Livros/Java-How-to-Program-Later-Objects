package examples.example94commisionemployee;

// CommissionEmployee class represents an employee paid
// percentage of gross sales.
public class CommissionEmployee extends Object {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales; // gross weekly sales
    private double commissionRates; // commission percentage

//    // Don't forget the protect method access allow the subclass, access the variables
//    protected final String firstName;
//    protected final String lastName;
//    protected final String socialSecurityNumber;
//    protected double grossSales;
//    protected double commissionRates;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
                              double commisionRates) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        if (commisionRates <= 0 || commisionRates >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRates = commisionRates;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
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
        return commissionRates * grossSales;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales,
                "commission rate", commissionRates);
    }
}
