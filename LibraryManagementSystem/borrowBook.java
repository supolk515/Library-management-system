package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class borrowBook {
    public static void Borrow(ArrayList<book> booklist){
        showBook.Show(booklist);
        System.out.println("Please enter the title of the book you would like to borrow.");
        Scanner sc = new Scanner(System.in);
        String borrow = sc.nextLine();
        boolean result = false;
        for (book book : booklist) {
            if (borrow.equals(book.getTitle()) && !book.isBorrowed()) {
                result = true;
                book.setBorrowed(true);
                System.out.println("You borrowed " + book.getTitle() + " successfully!");
            }
        }
        if (!result){
            System.out.println("No such a book was found or the book had been borrowed.");
        }
    }
}
