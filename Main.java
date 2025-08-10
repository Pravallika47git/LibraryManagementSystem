public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook(new Book("B001", "1984", "George Orwell"));
        library.addBook(new Book("B002", "To Kill a Mockingbird", "Harper Lee"));

        // Add users
        library.addUser(new User("U001", "John Doe"));
        library.addUser(new User("U002", "Jane Smith"));

        library.listBooks();
        library.listUsers();

        try {
            library.issueBook("U001", "B001");
            library.issueBook("U002", "B001"); // Should throw error: already issued
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        library.listBooks();
        library.listUsers();

        try {
            library.returnBook("U001", "B001");
            library.returnBook("U001", "B001"); // Should throw error: not issued
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        library.listBooks();
        library.listUsers();
    }
}

