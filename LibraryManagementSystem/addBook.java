package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class addBook {
    public static void Add(ArrayList<book> booklist){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the title.");
        String title = sc.nextLine();
        System.out.println("Please enter the author.");
        String author = sc.nextLine();
        System.out.println("Please enter the year.");
        int year = sc.nextInt();
        boolean borrowed = false;
        book b = new book(title,author,year,borrowed);
        booklist.add(b);
    }
}
