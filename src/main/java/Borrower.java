import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> booksList;

    public Borrower() {
        this.booksList = new ArrayList<Book>();
    }

    public int getNumOfBooks() {
        return this.booksList.size();
    }

    public void getBookFromLibrary(Library library) {
        Book book = library.removeBook();
        this.booksList.add(book);
    }
}