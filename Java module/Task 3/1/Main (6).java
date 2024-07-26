import java.util.Scanner;

class Book {
    private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "BookID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }
}

class Library {
    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added: " + book);
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID() == bookID) {
                System.out.println("Book removed: " + books[i].getTitle());
                books[i] = books[bookCount - 1];
                books[bookCount - 1] = null;
                bookCount--;
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public Book searchBook(int bookID) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID() == bookID) {
                return books[i];
            }
        }
        return null;
    }

    public void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
        } else {
            for (int i = 0; i < bookCount; i++) {
                System.out.println(books[i]);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library(100);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    Book newBook = new Book(bookID, title, author);
                    library.addBook(newBook);
                    break;
                case 2:
                    System.out.print("Enter book ID to remove: ");
                    int removeID = scanner.nextInt();
                    library.removeBook(removeID);
                    break;
                case 3:
                    System.out.print("Enter book ID to search: ");
                    int searchID = scanner.nextInt();
                    Book searchBook = library.searchBook(searchID);
                    if (searchBook != null) {
                        System.out.println("Book found: " + searchBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

