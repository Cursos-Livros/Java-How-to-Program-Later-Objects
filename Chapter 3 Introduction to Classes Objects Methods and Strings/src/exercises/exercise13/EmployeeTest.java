package exercises.exercise13;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Employee 1");
        System.out.println("Enter the name of 1 employee:");
        String employee1Name = input.nextLine();
        System.out.println("Enter the last name of 1 employee:");
        String employee1LastName = input.nextLine();
        System.out.println("Enter the month salary of employee 1:");
        double employee1MonthSalary = input.nextDouble();

//        System.out.println("Enter the number of 2 employee:");
//        String employee2Name = input.nextLine();
//        System.out.println("Enter the last name of 1 employee:");
//        String employee2LastName = input.nextLine();
//        System.out.println("Enter the month salary of employee 1:");
//        double employee2MonthSalary = input.nextDouble();

        Employee employee1 = new Employee(employee1Name, employee1LastName, employee1MonthSalary);
//        Employee employee2 = new Employee(employee2Name, employee2LastName, employee2MonthSalary);

        System.out.println("Yearly Salary:" + employee1.yearlySalary());

        System.out.println("Enter the percentage of raise: (Example 10)");
        int percentage = input.nextInt();

        System.out.println("Yearly with raise salary:" + employee1.raiseSalary(percentage));

    }
}
