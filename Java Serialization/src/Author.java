import java.io.Serializable;

// Клас, що представляє автора книги
class Author extends Human {
    private static final long serialVersionUID = 1L;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
    }
}

