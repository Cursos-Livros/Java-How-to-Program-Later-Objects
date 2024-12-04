package exercises.exercise14;

import java.util.Scanner;

public class BasePlusTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the employee name:");
        String employeeName = input.nextLine();
        System.out.println("Enter the employee last name:");
        String employeeLastName = input.nextLine();
        System.out.println("Enter the employee security social number:");
        String socialSecuritynumber = input.nextLine();

        System.out.println("Enter gross sale:");
        double grossSale = input.nextDouble();
        System.out.println("Enter commission rates:");
        double commissionRates = input.nextDouble();
        System.out.println("Enter base salary:");
        double baseSalary = input.nextDouble();

        Employee basePlusCommisionEmployee = new BasePlusCommisionEmployee(employeeName, employeeLastName, socialSecuritynumber, grossSale, commissionRates, baseSalary);

        System.out.println(basePlusCommisionEmployee.toString());
    }
}
