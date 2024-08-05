package example.example1account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        // cria um objeto account e atribui a myAccount
        Account myAccount =  new Account();

        // display o valor inicial como null
        System.out.printf("Initial name is %s:%n", myAccount.getName());

        // prompt for e de leitura
        System.out.println("Please enter the name: ");
        String name = input.nextLine();
        myAccount.setName(name);
        System.out.println();

        // mostra o nome guardado no objeto myAccount
        System.out.printf("Name in object myAccount is:%n%s%n",myAccount.getName());

    }
}
