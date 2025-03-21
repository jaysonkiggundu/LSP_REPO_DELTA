package org.howard.edu.lsp.midterm.question2;

/**
 * The BookDriver class is used to test the functionality of the Book class.
 * It creates instances of Book and demonstrates the equals and toString methods.
 */
public class BookDriver {

    /**
     * Main method to demonstrate the functionality of the Book class.
     * 
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Creating Book instances
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

        // Testing equals method
        System.out.println(book1.equals(book2)); // Output: true
        System.out.println(book1.equals(book3)); // Output: false

        // Testing toString method
        System.out.println(book1); // Output: Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 123456789, Year Published: 1925
    }
}
