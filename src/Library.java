
import java.util.ArrayList;
import java.util.List;

public final class Library {

    private List<Book> books = new ArrayList<>();
    public static int bookCounter = 0;

    public Library() {
        addBook("The Adventures of Sherlock Holmes", "Arthur Conan Doyle", "1999-06-17");
        addBook("Pride and Prejudice", "Jane Austen", "1999-06-17");
        addBook("1984", "George Orwell", "1999-06-17");
    }

    public void addBook(String title, String authorName, String authorBirth) {
        Book newBook = new Book(title, new Author(authorName, authorBirth));
        books.add(newBook);
        bookCounter++;
    }

    public void getBooks() {
        for (Book book : books) {
            if (book.isAvailable) {
                System.out.println(book.id + " - " + book.title + " by " + book.author.name);
            }
        }
    }

    public void loanABook(String bookID) {
    }
}
