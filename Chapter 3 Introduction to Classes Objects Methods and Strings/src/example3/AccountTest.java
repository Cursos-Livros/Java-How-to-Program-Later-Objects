package example3;

public class AccountTest {
    public static void main(String[] args) {
        // create two account object
        Account account1 = new Account("Jose Valim");
        Account account2 = new Account("Olga Santos");

        // display initial value of name (null)
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());
    }
}
