import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Do you want to see the available books? (yes/no)");
            String response = scanner.nextLine().toLowerCase();

            if (response.equals("yes")) {
                OUTER:
                while (true) {
                    System.out.println("Choose an option. (1,2,3,4)");
                    System.out.println("1 - Add book");
                    System.out.println("2 - List books");
                    System.out.println("3 - Loan a book");
                    System.out.println("4 - Exit");
                    String responseOption = scanner.nextLine();
                    
                    switch (responseOption) {
                        case "1":
                            System.out.println("What is the name of the book?");
                            String title = scanner.nextLine();
                            System.out.println("Who is the author of the book?");
                            String authorName = scanner.nextLine();
                            System.out.println("When was the author born? (yyyy-MM-dd)");
                            String authorBirth = scanner.nextLine();
                            library.addBook(title, authorName, authorBirth);
                            break;
                        case "2":
                            library.getBooks();
                            break;
                        case "3":
                            System.out.println("Enter the ID of the book you want.");
                            library.getBooks();
                            String bookID = scanner.nextLine();
                            library.loanABook(bookID);
                            break;
                        case "4":
                            System.out.println("Exiting the book options menu.");
                            break OUTER;
                        default:
                            System.out.println("Invalid option. Please choose again.");
                            break;
                    }
                }
            } else if (response.equals("no")) {
                System.out.println("Thank you for using the library system.");
                break;
            } else {
                System.out.println("Invalid response");
            }
        }

        scanner.close();
    }
}
