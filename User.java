import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class User {
    private final String userId;
    private final String name;
    private final Set<Book> issuedBooks;
    private static final int MAX_BOOKS = 5;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.issuedBooks = new HashSet<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getIssuedBooks() {
        return Collections.unmodifiableSet(issuedBooks);
    }

    public boolean issueBook(Book book) {
        if (issuedBooks.size() >= MAX_BOOKS) {
            return false; // User can't issue more books
        }
        return issuedBooks.add(book);
    }

    public boolean returnBook(Book book) {
        return issuedBooks.remove(book);
    }

    @Override
    public String toString() {
        return String.format("User[ID=%s, Name='%s', IssuedBooks=%d]", userId, name, issuedBooks.size());
    }
}
