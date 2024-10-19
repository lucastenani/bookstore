# Bookstore

## Project Description

The `bookstore` project is a simple Java application that allows for the management of book loans in a library. The system enables users to view available books and register loans. The application is based on a user interaction loop, where users can query the list of books and record a loan by providing their name.

## Functionality

### Book Management

- **Add a new book**: Including title and author (books are defined directly within the classes).
- **List all available books**: Displaying only the books that are available for loan.
- **Loan a book**: Allowing a user to select an available book and register the loan.

## Project Structure

The project is divided into main classes to maintain organization. Here are the classes and their functionalities:

### Main Classes

- **Book**: Represents a book, containing attributes such as id, title, author, availability, and registration dates.
- **Author**: Represents an author, containing attributes such as id, name, and date of birth.
- **Library**: Manages the list of books and includes methods to add books, list available ones, and register loans.

## Business Rules

- Check if the book is available before allowing a loan.
- Do not allow a book that has already been loaned to be loaned again until the program ends.

## Conclusion

This system provides a simple and efficient way to manage book loans in a library, allowing for an interactive experience for users and an organized structure for development.
