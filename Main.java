// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Library Management System");

        // Create instances of library objects
        Library library = new Library("My Library");
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Display information about the library
        library.displayBooks();
    }
}
