package book;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {

    private List<Book> bookCatalog;

    public BookCatalog() {
        this.bookCatalog = new ArrayList<>();
    }
    
    public void addBook(String title,String author, int year_of_publication){
        bookCatalog.add(new Book(title,author,year_of_publication));

    }

    public List<Book> searchByAuthor(String author){
        List<Book> booksByAuthor = new ArrayList<>();
        if(!bookCatalog.isEmpty()){
            for (Book b: bookCatalog){
                if(b.getAuthor().equalsIgnoreCase(author)){
                    booksByAuthor.add(b);
                }
            }
        
        }return booksByAuthor;
    }

    public List<Book> searchByYearGap(int startingYear, int finalYear){
        List<Book> booksByYearGap = new ArrayList<>();
        if(!bookCatalog.isEmpty()){
            for (Book b : bookCatalog){
                if(b.getYear_of_publication()>= startingYear && b.getYear_of_publication()<=finalYear){
                    booksByYearGap.add(b);
                }
            }
        }
        return booksByYearGap;
    }

    public Book searchBooksbyTitle(String title){
        Book bookPerTitle = null;
        if(!bookCatalog.isEmpty()){
            for (Book b : bookCatalog){
                if(b.getTitle() == title){
                    bookPerTitle = b;
                }
            }
        }
        return bookPerTitle;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BookCatalog{");
        sb.append("bookCatalog=").append(bookCatalog);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();
        bookCatalog.addBook("The Anthem", "Ayn Rand", 1954);

        System.out.println();
        System.out.println(bookCatalog);
    }

 
}
