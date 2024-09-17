package examples.example5staticvariable;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.printf("Employee before instantiation: %d%n", Employee.getCount());

        //Create 2 employees
        // Sempre que um novo employee for criado uaumenta 1 no contador
        Employee employee1 = new Employee("Susan", "Baker");
        Employee employee2 = new Employee("Bob", "Blue");

        // show that count is 2 after creating two Employees
        System.out.printf("%nEmployees after instantiation:%n");
        System.out.printf("via e1.getCount(): %d%n", employee1.getCount());
        System.out.printf("via e2.getCount(): %d%n", employee1.getCount());
        System.out.printf("via Employee.getCount(): %d%n", Employee.getCount());

        // get names of employees
        System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n",employee1.getFirstName(), employee1.getLastNAme(),
                employee2.getFirstName(), employee2.getLastNAme());
    }
}
