
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        OUTER:
        while (true) {
            System.out.println("Do you want to see the available books? (yes/no)");
            String response = scanner.nextLine().toLowerCase();

            switch (response) {
                case "yes":
                    System.out.println("Choose an option. (1,2,3,4)");
                    System.out.println("1 - Add book");
                    System.out.println("2 - List books");
                    System.out.println("3 - Loan a book");
                    System.out.println("4 - Exit");
                    String responseOption = scanner.nextLine();
                    break;
                case "no":
                    System.out.println("Thank you for using the library system.");
                    break OUTER;
                default:
                    System.out.println("Invalid response");
                    break;
            }
        }

    }
}
