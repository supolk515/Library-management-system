package LibraryManagementSystem;

public class Book {
    private final String title;
    private final String author;
    private final int year;
    private boolean borrowed;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public boolean isBorrowed() { return borrowed; }
    public void setBorrowed(boolean borrowed) { this.borrowed = borrowed; }

    @Override
    public String toString() {
        return title + " | " + author + " | " + year + " | "
                + (borrowed ? "borrowed" : "available");
    }
}
