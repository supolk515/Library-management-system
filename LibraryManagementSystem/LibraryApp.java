package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        System.out.println("Welcome to library management system!");
        try (Scanner scanner = new Scanner(System.in)) {
            ConsoleInput input = new ConsoleInput(scanner);
            while (true) {
                System.out.println();
                System.out.println("1. Add a book");
                System.out.println("2. Show all books");
                System.out.println("3. Search for a book");
                System.out.println("4. Borrow a book");
                System.out.println("5. Return a book");
                System.out.println("0. Exit");
                int choice = input.readInt("Please choose an option.", 0, 5);
                switch (choice) {
                    case 1 -> LibraryOperations.addBook(books, input);
                    case 2 -> LibraryOperations.showBooks(books);
                    case 3 -> LibraryOperations.searchBooks(books, input);
                    case 4 -> LibraryOperations.borrowBook(books, input);
                    case 5 -> LibraryOperations.returnBook(books, input);
                    case 0 -> {
                        System.out.println("Goodbye!");
                        return;
                    }
                    default -> throw new IllegalStateException("Unexpected menu option.");
                }
            }
        } catch (NoSuchElementException exception) {
            System.out.println("Input closed. Goodbye!");
        }
    }
}
