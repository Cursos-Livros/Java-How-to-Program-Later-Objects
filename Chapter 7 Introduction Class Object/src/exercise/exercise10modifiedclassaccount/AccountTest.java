package exercise.exercise10modifiedclassaccount;

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
        System.out.printf("%s balance: $ %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $ %.2f%n", account2.getName(), account2.getBalance());

        // Display saldo
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        // Operacao de transferencia entre a conta 1 e conta 2
        System.out.print("Enter withdraw for account1 to account2: ");
        double withdraw = input.nextDouble();
        account1.withDraw(withdraw, account2);// obtain user input
        System.out.printf("%nAdding to account2 balance: %.2f%n", account2.getBalance());
        System.out.printf("%nAccount1 new balance: %.2f%n", account1.getBalance());

    }
}
