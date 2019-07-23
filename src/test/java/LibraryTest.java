import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;
    private Library library;

    @Before
    public void setUp() {
        book = new Book("harry potter", "jk rowling", "magic");
        library = new Library();
    }

    @Test
    public void canGetStock() {
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBookWhenStockIsLessThanCapacity() {
        library.addBook(book);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void cantAddBookWhenStockIsMoreThanCapacity() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.stockCount());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.stockCount());
    }
}
