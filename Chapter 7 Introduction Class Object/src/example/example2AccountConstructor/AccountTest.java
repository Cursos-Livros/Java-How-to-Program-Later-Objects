package example.example2AccountConstructor;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        // cria 2 objetos Account
        Account account1 =  new Account("Jane Green");
        Account account2 = new Account("Jhon Blue");

        // mostra o valor inicial de cada objeto account
        System.out.println("Account 1 name is: " + account1.getName());
        System.out.println("Account 2 name is: " + account2.getName());
    }
}
