package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        System.out.println("Welcome to library management system!");
        Scanner sc = new Scanner(System.in);
        ArrayList<book> books = new ArrayList<>();

        while(true) {
            System.out.println();
            System.out.println("To add a book, please press 1.");
            System.out.println("To show all books, please press 2.");
            System.out.println("To search for a book, please press 3.");
            System.out.println("To borrow a book, please press 4.");
            System.out.println("To return a book, please press 5.");
            System.out.println("To exit, please press 0.");

            int input = sc.nextInt();
            switch (input){
                case 1 -> {
                    System.out.println("You choose to add a book.");
                    addBook.Add(books);
                }
                case 2 -> {
                    System.out.println("You choose to show all books.");
                    showBook.Show(books);
                }
                case 3 -> {
                    System.out.println("You choose to search for a book.");
                    searchBook.Search(books);
                }
                case 4 -> {
                    System.out.println("You choose to borrow a book.");
                    borrowBook.Borrow(books);
                }
                case 5 -> {
                    System.out.println("You choose to return a book.");
                    returnBook.Return(books);
                }
                case 0 -> {
                    System.out.println("You choose to exit.");
                    System.exit(0);
                }
                default -> System.out.println("Please enter a valid number!");
            }
        }
    }
}
