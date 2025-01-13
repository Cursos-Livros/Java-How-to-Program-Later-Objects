package example;

public class PolymorphimTest {
    public static void main(String[] args) {
        // assign superclass reference to superclass variable
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "222222", 10000, .06);

        // assign subclass variable to a subclass variable
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "333" +
                "-333", 5000, .04, 300);

        // invoke toString on superclass object using superclass variable
        System.out.printf("%s %s:%n%n%s%n%n", "Call CommissionEmployee's toString with superclass reference ", "to superclass object",
                commissionEmployee.toString());

        // invoke toString on subclass object using subclass variable
        System.out.printf("%s %s:%n%n%s%n%n", "Call BasePlusCommissionEmployee's toString with subclass", "reference to subclass object",
                basePlusCommissionEmployee.toString());

        // invoke toString on subclass object using superclass variable
        // okay here was assigned a object in a new object
        // the same thing like do int x = 1 and y = 0 x = y now x value the value in the variable y means 0
        CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;

        System.out.printf("%s %s:%n%n%s%n", "Call BasePlusCommissionEmployee's toString with superclass", "reference to subclass object",
                commissionEmployee2.toString());
    }
}
