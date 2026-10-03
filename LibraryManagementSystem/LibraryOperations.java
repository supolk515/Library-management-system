package LibraryManagementSystem;

import java.util.List;
import java.util.Locale;

public class LibraryOperations {
    public static void addBook(List<Book> books, ConsoleInput input) {
        String title = input.readText("Please enter the title.");
        String author = input.readText("Please enter the author.");
        int year = input.readInt("Please enter the year.", 1, Integer.MAX_VALUE);
        books.add(new Book(title, author, year));
        System.out.println("Book added successfully!");
    }

    public static void showBooks(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void searchBooks(List<Book> books, ConsoleInput input) {
        String query = input.readText("Please enter a title or author to search.")
                .toLowerCase(Locale.ROOT);
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase(Locale.ROOT).contains(query)
                    || book.getAuthor().toLowerCase(Locale.ROOT).contains(query)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No results.");
        }
    }

    public static void borrowBook(List<Book> books, ConsoleInput input) {
        changeBorrowedStatus(books, input, true);
    }

    public static void returnBook(List<Book> books, ConsoleInput input) {
        changeBorrowedStatus(books, input, false);
    }

    private static void changeBorrowedStatus(List<Book> books, ConsoleInput input,
                                             boolean borrow) {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        String title = input.readText("Please enter the title of the book to "
                + (borrow ? "borrow." : "return."));
        boolean titleFound = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                titleFound = true;
                if (book.isBorrowed() != borrow) {
                    book.setBorrowed(borrow);
                    System.out.println("You " + (borrow ? "borrowed " : "returned ")
                            + book.getTitle() + " successfully!");
                    // One request changes only one eligible copy with this title.
                    return;
                }
            }
        }
        if (!titleFound) {
            System.out.println("No book with that title was found.");
        } else {
            System.out.println(borrow ? "All copies are already borrowed."
                    : "No borrowed copy to return.");
        }
    }
}
