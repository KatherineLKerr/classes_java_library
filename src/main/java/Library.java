import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library() {
        this.stock = new ArrayList<Book>();
        this.capacity = 3;
    }

    public int stockCount() {
        return stock.size();
    }

    public void addBook(Book book) {
        if (this.stockCount() < this.capacity) {
            this.stock.add(book);
        }
    }

    public Book removeBook() {
        return this.stock.remove(0);
    }
}


