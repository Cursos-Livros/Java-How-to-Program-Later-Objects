package exercise.exercise11invoiceclass;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);

        System.out.println("Enter the item code:");
        int itemCode = input.nextInt();

        System.out.println("Enter the item description:");
        input.nextLine();
        String itemDescription = input.nextLine();

        System.out.println("Enter the item quantity");
        int itemQuantity = input.nextInt();

        System.out.println("Enter the item price:");
        double itemPrice = input.nextDouble();

        Invoice invoice = new Invoice(itemCode, itemDescription, itemQuantity, itemPrice);

        invoice.invoiceToString();
    }
}
