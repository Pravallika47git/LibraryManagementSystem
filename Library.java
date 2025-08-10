import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private final Map<String, Book> books;
    private final Map<String, User> users;

    public Library() {
        books = new HashMap<>();
        users = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getBookId(), book);
    }

    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public Book getBook(String bookId) {
        return books.get(bookId);
    }

    public User getUser(String userId) {
        return users.get(userId);
    }

    public void issueBook(String userId, String bookId) throws Exception {
        User user = getUser(userId);
        Book book = getBook(bookId);

        if (user == null) throw new Exception("User not found");
        if (book == null) throw new Exception("Book not found");
        if (book.isIssued()) throw new Exception("Book already issued");
        if (!user.issueBook(book)) throw new Exception("User has reached max issued books");

        book.setIssued(true);
        System.out.println("Book issued successfully.");
    }

    public void returnBook(String userId, String bookId) throws Exception {
        User user = getUser(userId);
        Book book = getBook(bookId);

        if (user == null) throw new Exception("User not found");
        if (book == null) throw new Exception("Book not found");
        if (!book.isIssued()) throw new Exception("Book is not issued");
        if (!user.returnBook(book)) throw new Exception("User did not issue this book");

        book.setIssued(false);
        System.out.println("Book returned successfully.");
    }

    public void listBooks() {
        System.out.println("Library Books:");
        Collection<Book> allBooks = books.values();
        allBooks.forEach(System.out::println);
    }

    public void listUsers() {
        System.out.println("Library Users:");
        Collection<User> allUsers = users.values();
        allUsers.forEach(System.out::println);
    }
}
