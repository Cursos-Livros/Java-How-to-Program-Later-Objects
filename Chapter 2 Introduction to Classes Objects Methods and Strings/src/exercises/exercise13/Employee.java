package exercises.exercise13;

public class Employee {
    String name;
    String lastName;
    Double monthSalary;

    public Employee(String name, String lastName, Double monthSalary) {
        this.name = name;
        this.lastName = lastName;

        if (monthSalary > 0) {
            this.monthSalary = monthSalary;
        } else {
            System.out.println("This value is not accepted!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(Double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public Double yearlySalary() {
        return monthSalary * 12;
    }

    public Double raiseSalary(Integer percentage) {
        // The result will not double if has a int number
        // Divided by a int number
        double raiseValue = yearlySalary() * (percentage / 100.0);
        return yearlySalary() + raiseValue;
    }
}
