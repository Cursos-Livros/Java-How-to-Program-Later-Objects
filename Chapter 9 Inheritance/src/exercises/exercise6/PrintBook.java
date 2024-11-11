package exercises.exercise6;

public class PrintBook extends Book {
    String publisher;
    Long ISBN;

    public PrintBook(String title, Integer yearPublication, String author, String publisher, Long ISBN) {
        super(title, yearPublication, author);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n%s : %s%n%s: %d%n",
                "Audiobook",
                super.toString(),
                "Publisher", publisher,
                "ISBN", ISBN);
    }
}
