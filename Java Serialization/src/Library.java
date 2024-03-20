import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Клас, що представляє бібліотеку
class Library implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private List<BookStore> bookStores;
    private List<BookReader> readers;

    public Library(String name) {
        this.name = name;
        this.bookStores = new ArrayList<>();
        this.readers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BookStore> getBookStores() {
        return bookStores;
    }

    public void setBookStores(List<BookStore> bookStores) {
        this.bookStores = bookStores;
    }

    public List<BookReader> getReaders() {
        return readers;
    }

    public void setReaders(List<BookReader> readers) {
        this.readers = readers;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", bookStores=" + bookStores +
                ", readers=" + readers +
                '}';
    }
}
