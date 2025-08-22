import java.util.Scanner;

class Book {
    String title;
    String author;

    void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First book
        Book b1 = new Book();
        System.out.print("Enter title of Book 1: ");
        b1.title = sc.nextLine();
        System.out.print("Enter author of Book 1: ");
        b1.author = sc.nextLine();

        // Second book
        Book b2 = new Book();
        System.out.print("Enter title of Book 2: ");
        b2.title = sc.nextLine();
        System.out.print("Enter author of Book 2: ");
        b2.author = sc.nextLine();

        // Display results
        System.out.println("\nBook 1:");
        b1.displayBook();

        System.out.println("\nBook 2:");
        b2.displayBook();

        sc.close();
    }
}
