package example1;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);

        // create an Account object and assign it to myAccount
        Account myAccount = new Account();

        // display initial value of name (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
    }
}
