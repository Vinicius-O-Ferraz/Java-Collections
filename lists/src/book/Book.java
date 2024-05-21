package book;

public class Book {
    private String title;
    private String author;
    private int year_of_publication;

    public Book(String author, String title, int year_of_publication) {
        this.author = author;
        this.title = title;
        this.year_of_publication = year_of_publication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear_of_publication() {
        return year_of_publication;
    }

    public void setYear_of_publication(int year_of_publication) {
        this.year_of_publication = year_of_publication;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", year_of_publication=" + year_of_publication + "]";
    }


}
