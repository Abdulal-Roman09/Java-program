public class Book {

    String title;
    String author;
    int pages;

    // Default constructor
    Book() {
        title = "Unknown Title";
        author = "Unknown Author";
        pages = 0;
    }

    // Constructor with title and author
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 50;
    }

    // Constructor with title, author, and pages
    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Method to print book details
    void print() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }

    // Main method
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 281);

        book1.print();
        System.out.println();
        book2.print();
        System.out.println();
        book3.print();
    }
}
