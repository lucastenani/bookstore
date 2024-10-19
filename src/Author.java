import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Author {
    int id;
    String name;
    LocalDate dateOfBirth;

    public Author(String name, String dateOfBirth) {
        this.id = new Random().nextInt(1000);
        this.name = name;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.dateOfBirth = LocalDate.parse(dateOfBirth, formatter);
    }
}
