package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class searchBook {
    public static void Search(ArrayList<book> booklist){
        System.out.println("Please enter the book's title or author you would like to search.");
        Scanner sc = new Scanner(System.in);
        String search = sc.nextLine();
        System.out.println("Results are as followed:");
        int count = 0;
        for (book book : booklist) {
            if (book.getTitle().contains(search) || book.getAuthor().contains(search)) {
                System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getYear());
                count++;
            }
        }
        if (count == 0){
            System.out.println("No results.");
        }
    }

}
