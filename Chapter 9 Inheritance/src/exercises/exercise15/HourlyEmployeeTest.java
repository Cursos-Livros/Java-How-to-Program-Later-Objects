package exercises.exercise15;

import java.util.Scanner;

public class HourlyEmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the employee name:");
        String employeeName = input.nextLine();
        System.out.println("Enter the employee last name:");
        String employeeLastName = input.nextLine();
        System.out.println("Enter the employee security social number:");
        String socialSecuritynumber = input.nextLine();

        System.out.println("Enter the hourly wage:");
        double hourlyWage = input.nextDouble();
        System.out.println("Enter the wage:");
        double wage = input.nextDouble();

        Employee hourlyEmployee = new HourlyEmployee(employeeName, employeeLastName, socialSecuritynumber, hourlyWage
                , wage);

        System.out.println(hourlyEmployee.toString());
    }
}
