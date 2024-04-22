package example1;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the name:");
        String name = input.nextLine();

        // create an Account object and assign it to myAccount
        Account myAccount = new Account();

        myAccount.setName(name);

        // display initial value of name (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
    }
}
