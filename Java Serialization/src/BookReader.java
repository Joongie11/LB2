import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Клас, що представляє читача
class BookReader extends Human implements Serializable {
    private static final long serialVersionUID = 1L;
    private int readerId;
    private List<Book> borrowedBooks;

    public BookReader(String firstName, String lastName, int readerId) {
        super(firstName, lastName);
        this.readerId = readerId;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String toString() {
        return "BookReader{" +
                "readerId=" + readerId +
                ", borrowedBooks=" + borrowedBooks +
                "} " + super.toString();
    }
}
