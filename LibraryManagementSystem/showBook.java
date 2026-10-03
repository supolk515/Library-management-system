package LibraryManagementSystem;

import java.util.ArrayList;

public class showBook {
    public static void Show(ArrayList<book> booklist){
        for (book book : booklist) {
            System.out.print(book.getTitle() + " " + book.getAuthor() + " " + book.getYear() + " ");
            if (!book.isBorrowed()) {
                System.out.println("available");
            } else {
                System.out.println("borrowed");
            }
        }
    }
}
