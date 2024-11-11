package exercises.exercise6;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Book Class");
        System.out.println("Enter the book name:");
        String bookName = input.nextLine();
        System.out.println("Enter the year publish:");
        int yearPublication = input.nextInt();
        input.nextLine();
        System.out.println("Enter the author name's:");
        String authorName = input.nextLine();

        Book book = new Book(bookName, yearPublication, authorName);

        System.out.println(book.toString());

        System.out.println("PrintBook Class");
        System.out.println("enter the publisher name:");
        String publisherName = input.nextLine();
        System.out.println("Enter ISBN:");
        long isbn = input.nextLong();
        input.nextLine();
        PrintBook printBook = new PrintBook(bookName, yearPublication, authorName, publisherName, isbn);

        System.out.println(printBook.toString());
    }
}
