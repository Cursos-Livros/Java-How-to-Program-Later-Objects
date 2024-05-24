package exercises.exercise20;

import java.util.Locale;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the worked hours of the employee number 1");
        int workedHours = scanner.nextInt();

        System.out.println("Enter the value of hour:");
        double hourValue = scanner.nextDouble();

        Salary employee1 = new Salary(workedHours, hourValue);

        System.out.println("Gross salary employee 1: " + employee1.grossSalary());
    }
}
