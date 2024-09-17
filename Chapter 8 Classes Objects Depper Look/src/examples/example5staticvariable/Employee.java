package examples.example5staticvariable;

public class Employee {
    private static int count = 0;
    private String firstName;
    private String lastNAme;

    public Employee(String firstName, String lastNAme) {
        this.firstName = firstName;
        this.lastNAme = lastNAme;

        ++count;

        System.out.printf("Employee constructor: %s %s; count = %d%n", firstName,lastNAme, count);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }

    public static int getCount(){
        return count;
    }
}
