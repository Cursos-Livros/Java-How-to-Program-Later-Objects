package exercises.exercise15;

public class HourlyEmployee extends Employee {
    double hours;
    double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, Double hours,
                          double wage) {
        super(firstName, lastName, socialSecurityNumber);
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be > 0");
        }

        if (hours < 0.0 || hours > 168) {
            throw new IllegalArgumentException("Hours must be 0 and 168");
        }

        this.wage = wage;
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168) {
            throw new IllegalArgumentException("Hours must be 0 and 168");
        }
        this.hours = hours;
    }

    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be > 0");
        }
        this.wage = wage;
    }

    public double earnings() {
        if (hours > 40) {
            double extraHours = hours - 40;
            double extraWage = extraHours * (wage * 1.5);
            return (hours * wage) + extraWage;
        }
        return hours * wage;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n", super.toString(), "hours", hours, "wage", wage,
                "Earnings", earnings());
    }
}
