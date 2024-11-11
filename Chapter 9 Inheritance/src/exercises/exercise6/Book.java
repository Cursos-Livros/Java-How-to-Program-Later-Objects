package exercises.exercise6;

public class Book {
    private String title;
    private Integer yearPublication;
    private String author;

    public Book(String title, Integer yearPublication, String author) {
        this.title = title;
        this.yearPublication = yearPublication;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(Integer yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String getArtistName() {
        return author;
    }

    public void setArtistName(String artistName) {
        this.author = artistName;
    }

    @Override
    public String toString() {
        return String.format("%s: %s. %n%s: %s.%n%s: %s.%n",
                "Tittle", title,
                "Year Publication", yearPublication,
                "Author", author);
    }
}
