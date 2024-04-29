package exercises.exercise2;

import java.util.Locale;
import java.util.Scanner;

class InvoiceTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Number of order");
        int order = input.nextInt();

        System.out.println("Description:");
        input.nextLine();
        String description = input.nextLine();

        System.out.println("Item Quantity");
        int itemQuantity = input.nextInt();

        System.out.println("Item Price:");
        double itemPrice = input.nextDouble();


        Invoice invoice = new Invoice(order, description, itemQuantity,  itemPrice);

        System.out.println("Invoice:");
        System.out.println("Number Order: " + invoice.getNumber());
        System.out.println("Item Description: " + invoice.getDescription());
        System.out.println("Item Quantity: " +  invoice.getItemQuantity());
        System.out.println("Item Price: " + invoice.getPrice());
        System.out.println("Total: " + invoice.invoiceAmmount());
    }
}
