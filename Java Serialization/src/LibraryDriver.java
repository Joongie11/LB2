import java.util.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BookStore implements Serializable {
    private String name;
    private List<Book> books;

    public BookStore(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}

public class LibraryDriver {

    public static void main(String[] args) {
        // Створення бібліотеки
        Library library = new Library("Міська бібліотека");

        // Додавання книг до бібліотеки
        addBooksToLibrary(library);

        // Додавання читачів до бібліотеки
        addReadersToLibrary(library);

        // Серіалізація бібліотеки
        serializeLibrary(library, "library.ser");

        // Десеріалізація бібліотеки
        Library restoredLibrary = deserializeLibrary("library.ser");

        // Перевірка успішності десеріалізації та виведення інформації про бібліотеку
        if (restoredLibrary != null) {
            System.out.println("Десеріалізована бібліотека: ");
            System.out.println(restoredLibrary);
        }
    }

    // Метод для додавання книг до бібліотеки
    public static void addBooksToLibrary(Library library) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть книги для додавання до бібліотеки (формат: <назва книги>):");
        System.out.println("Введіть 'end', щоб завершити введення.");

        if (library.getBookStores().isEmpty()) {
            System.out.println("У вашій бібліотеці немає книжкових сховищ. Спочатку додайте книжкове сховище.");
            return;
        }

        while (true) {
            String bookName = scanner.nextLine();
            if (bookName.equals("end")) {
                break;
            }

            List<Author> authors = new ArrayList<>();
            while (true) {
                System.out.println("Введіть ім'я автора (або 'end' для завершення):");
                String firstName = scanner.nextLine();
                if (firstName.equals("end")) {
                    break;
                }

                System.out.println("Введіть прізвище автора:");
                String lastName = scanner.nextLine();
                authors.add(new Author(firstName, lastName));
            }

            System.out.println("Введіть рік видання:");
            int year = Integer.parseInt(scanner.nextLine());

            System.out.println("Введіть номер видання:");
            int edition = Integer.parseInt(scanner.nextLine());

            Book book = new Book(bookName, authors, year, edition);
            library.getBookStores().get(0).getBooks().add(book); // Закладаємо, що книги додаються до першого книжкового сховища
        }
    }





    // Метод для додавання читачів до бібліотеки
    public static void addReadersToLibrary(Library library) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть читачів для додавання до бібліотеки (формат: <ім'я>,<прізвище>,<реєстраційний номер>):");
        System.out.println("Введіть 'end', щоб завершити введення.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            String[] readerInfo = input.split(",");
            if (readerInfo.length != 3) {
                System.out.println("Некоректний формат введення. Спробуйте знову.");
                continue;
            }

            String firstName = readerInfo[0];
            String lastName = readerInfo[1];
            int readerId = Integer.parseInt(readerInfo[2]);

            BookReader reader = new BookReader(firstName, lastName, readerId);
            library.getReaders().add(reader);
        }
    }

    // Метод для серіалізації бібліотеки
    public static void serializeLibrary(Library library, String fileName) {
        // Реалізація методу серіалізації
    }

    // Метод для десеріалізації бібліотеки
    public static Library deserializeLibrary(String fileName) {
        // Реалізація методу десеріалізації
        return null;
    }
}





