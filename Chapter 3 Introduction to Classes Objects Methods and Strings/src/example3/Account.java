package example3;

public class Account {
    private String name; // instance variable
    private double balance; // instance variable

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public Account(String name, double balance){
        this.name = name;
        if (balance > 0.0){
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount){
        if (depositAmount > 0.0){
            balance = balance + depositAmount;
        }
    }

}