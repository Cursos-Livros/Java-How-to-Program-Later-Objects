package exercises.exercise14;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the employee name:");
        String employeeName = input.nextLine();
        System.out.println("Enter the employee last name:");
        String employeeLastName = input.nextLine();
        System.out.println("Enter the employee security social number:");
        String socialSecuritynumber = input.nextLine();

        System.out.println("Enter the gross sales:");
        double grossSales = input.nextDouble();
        System.out.println("Enter the commision rates:");
        double commisionRate = input.nextDouble();

        Employee commisionEmployee = new CommisionEmployee(employeeName, employeeLastName, socialSecuritynumber, grossSales, commisionRate);

        System.out.println(commisionEmployee.toString());
    }
}
