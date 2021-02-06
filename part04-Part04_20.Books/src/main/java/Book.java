
public class Book {

    private String title;
    private int pagesCount;
    private int publicationYear;

    public Book(String title, int pagesCount, int publicationYear) {
        this.title = title;
        this.pagesCount = pagesCount;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPagesCount() {
        return this.pagesCount;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pagesCount + " pages, " + this.publicationYear;
    }
}
