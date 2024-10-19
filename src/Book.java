
import java.util.Date;

public class Book {

    public int id;
    public String title;
    public Author author;
    public boolean isAvailable;
    public Date createdAt;
    public Date updatedAt;

    public Book(String title, Author author) {
        this.id = 0;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }
}
