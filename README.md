# bookstore

# Bookstore System Challenge Checklist

## 1. Initial Project Setup

- [x] Create a new Java project.
- [x] Set up the project with the main classes mentioned (Book, Author, Library).
- [x] Add data structures to store books, authors, and loans (ArrayList).

## 2. Book Class

- [x] Create the `Book` class with the following attributes:
  - [x] `id` (Unique identifier)
  - [x] `title` (Book title)
  - [x] `author` (Object of type `Author`)
  - [x] `available` (Boolean to indicate if it is available)
  - [x] `registrationDate` (Date when the book was registered)
  - [x] `lastUpdateDate` (Date when the book was last updated)

## 3. Author Class

- [ ] Create the `Author` class with the attributes:
  - [ ] `id` (Unique identifier)
  - [ ] `name` (Author's name)
  - [ ] `dateOfBirth` (Author's date of birth)

## 4. Library Class

- [ ] Create the `Library` class with the following attributes:
  - [ ] List of books (`List<Book>`)
  - [ ] List of authors (`List<Author>`)
  - [ ] List of loans (`List<Loan>`)
- [ ] Implement methods:
  - [ ] **Add book**: Method to add new books.
  - [ ] **List available books**: Show only books marked as "available."
  - [ ] **Loan a book**: Record a book loan, mark it as unavailable, and associate it with a user.

## 5. Book Management

- [ ] Define an initial set of books and authors directly in the class.
- [ ] Implement functionality to:
  - [ ] List all available books (only those that can be loaned).
  - [ ] Loan a book: the user selects by `id`, enters their name, and the book is marked as loaned.
  - [ ] Display a success message after the loan.

## 6. User Interaction (Loop)

- [ ] Implement a loop in the console that:
  - [ ] Asks the user if they want to see the available books.
  - [ ] If the user answers **YES**:
    - [ ] List available books.
    - [ ] Allow the user to choose the book's `id`.
    - [ ] Display a message confirming the loan.
  - [ ] If the user answers **NO**:
    - [ ] End the system with a closing message.

## 7. Business Rules

- [ ] Check if the book is available before allowing a loan.
- [ ] Do not allow a book that has already been loaned to be loaned again until the program ends.
