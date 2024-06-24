package example2;

public class Account {
    private String name; // instance variable

    // constructor initializes name with parameter name
    public Account(String name) {  //constructor name is class name
        this.name = name;
    }

    public void setName(String name) {
        this.name = name; // store the name
    }

    // method to retrieve the name from the object
    public String getName() {
        return name; // return value of name to caller
    }
}