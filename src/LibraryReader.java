import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;

public class LibraryReader implements Reader {

    @Value("34")
    private int ticketNumber;

    @Autowired
    private ArrayList<Book> books;

    private ArrayList<Book> booksRead;

    public LibraryReader(ArrayList<Book> booksRead){
        this.booksRead = booksRead;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Book> getBooksRead() {
        return booksRead;
    }

    @Override
    public void readBook(Book book) {
        booksRead.add(book);
    }
}
