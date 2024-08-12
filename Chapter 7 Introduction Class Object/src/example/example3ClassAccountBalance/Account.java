package example.example3ClassAccountBalance;

/*
  Variaveis de Instancia
  Mantem os dados de cada instancia (ocorrencia daquela classe)

* Modificador de Acesso
*
  Encapsulamento
  O acesso as variaveis de intancia sao feitos a partir de metodos
  nao se deve dar acesso direto as variaveis de instancia
* */

public class Account {
    private String name;
    private double balance;

    // construtor que inicializa name atraves do parametro name
    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance += depositAmount;
        }
    }
}
