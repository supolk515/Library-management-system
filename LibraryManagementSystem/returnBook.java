package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class returnBook {
    public static void Return(ArrayList<book> booklist) {
        System.out.println("Please enter the title of the book you would like to return.");
        Scanner sc = new Scanner(System.in);
        String Return = sc.nextLine();
        boolean result = false;
        for (book book : booklist) {
            if (Return.equals(book.getTitle()) && book.isBorrowed()) {
                result = true;
                book.setBorrowed(false);
                System.out.println("You returned " + book.getTitle() + " successfully!");
            }

            if (!result) {
                System.out.println("No such a book was found or the book had been returned.");
            }
        }
    }
}