package exercises.exercise6;

public class AudioBook extends Book{
    Integer length;
    String artistName;

    public AudioBook(String title, Integer yearPublication, String author, Integer length, String artistName) {
        super(title, yearPublication, author);
        this.length = length;
        this.artistName = artistName;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n%s : %d%n%s: %s%n",
                "Audiobook",
                super.toString(),
                "Length", length,
                "Artist name", artistName);
    }
}
