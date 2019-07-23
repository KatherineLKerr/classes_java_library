import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book;
    private Library library;
    private Borrower borrower;

    @Before
    public void setUp() {
        book = new Book("harry potter", "jk rowling", "magic");
        library = new Library();
        borrower = new Borrower();
        library.addBook(book);
    }

    @Test
    public void canTakeBookFromLibrary() {
        borrower.getBookFromLibrary(library);
        assertEquals(1, borrower.getNumOfBooks());
    }
}
