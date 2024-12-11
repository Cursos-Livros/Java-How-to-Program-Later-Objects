package exercises.exercise16;

public class Employee {
    String firstName;
    String lastName;
    String socialSecurityNumber;
    Integer compensatioModel;
    CompensationModel compensationModel;

    public Employee(String firstName, String lastName, String socialSecurityNumber, int compensationModel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.compensatioModel = compensationModel;
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

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s",
                "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber
        );
    }
}
