/**
 * The Book class represents a book in a library system.
 * It contains the book's title, author, ISBN number, and the year it was published.
 * The class provides methods to compare books and to represent a book as a string.
 */
public class Book {
    
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    /**
     * Constructor to initialize a new Book object with the provided details.
     * 
     * @param title The title of the book.
     * @param author The author of the book.
     * @param ISBN The ISBN of the book (unique identifier).
     * @param yearPublished The year the book was published.
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    /**
     * Gets the title of the book.
     * 
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the book.
     * 
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Gets the ISBN of the book.
     * 
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Gets the year the book was published.
     * 
     * @return The year the book was published.
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Sets the title of the book.
     * 
     * @param title The new title of the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets the author of the book.
     * 
     * @param author The new author of the book.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Sets the ISBN of the book.
     * 
     * @param ISBN The new ISBN of the book.
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Sets the year the book was published.
     * 
     * @param yearPublished The new year the book was published.
     */
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    /**
     * Overrides the equals method to compare two books based on their ISBN and author.
     * Books are considered equal if they have the same ISBN and author.
     * 
     * @param obj The object to compare to this book.
     * @return true if the books are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book otherBook = (Book) obj;
        return this.ISBN.equals(otherBook.ISBN) && this.author.equals(otherBook.author);
    }

    /**
     * Overrides the toString method to return a meaningful string representation of a book.
     * 
     * @return A string containing the book's title, author, ISBN, and year of publication.
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}
