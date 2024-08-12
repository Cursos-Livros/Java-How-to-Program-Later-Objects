package example.example3ClassAccountBalance;

import java.util.Scanner;

/*
    Construtores
    construtores nao retornam valor
    normalmente sao declarados como publicos
    constutores padroes sao declarados de forma implicita na criacao de metodo
    Exemplo
    Scanner input = new Scanne(); -> () declara um construtor padrao inplicito vazio ouseja null
    Nao existe construtor padrao caso tenhamos o nosso proprio

 */

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // cria 2 objetos Account
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("Jhon Blue", -7.53);

        // display initial balance de cada objeto
        System.out.printf("%s balance: $ %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $ %n", account1.getName(), account2.getBalance());

        // Display saldo
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        // mostrar os saldos
        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", account1.getName(), account2.getBalance());

    }
}
