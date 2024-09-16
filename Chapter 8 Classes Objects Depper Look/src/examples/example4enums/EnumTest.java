package examples.example4enums;

import java.util.EnumSet;

/* Esse codigo serve para mostrar que tambem é possivel utilizar um enum instanciado
   Dado uma enum class e um set de constantes uma vez que haja um construtor dara para
   utlizar um enum instancia
 */

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("All Books:");

        // print all books in enum Book
        for(Book book: Book.values()){
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
        }

        System.out.printf("%nDisplay a range of enum constants:%n");

        // print first four books
        for(Book book: EnumSet.range(Book.JHTP, Book.CPPHTP)){
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
        }
    }
}
