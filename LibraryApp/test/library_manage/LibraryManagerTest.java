import library_manage.Book;
import library_manage.LibraryManager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryManagerTest {

    private LibraryManager manager;

    @Before
    public void setUp() {
        manager = new LibraryManager();
        manager.addBook(new Book("B001", "Java Basics", "John Smith"));
        manager.addBook(new Book("B002", "Data Structures", "Alice Brown"));
    }

    @Test
    public void testAddBook() {
        int initialSize = manager.getBooks().size();
        manager.addBook(new Book("B003", "Algorithms", "Mark Green"));
        assertEquals(initialSize + 1, manager.getBooks().size());
    }

    @Test
    public void testSearchBookFound() {
        Book found = manager.searchBook("B001");
        assertNotNull(found);
        assertEquals("Java Basics", found.getTitle());
        assertEquals("John Smith", found.getAuthor());
    }

    @Test
    public void testSearchBookNotFound() {
        Book found = manager.searchBook("B999");
        assertNull(found);
    }

    @Test
    public void testDeleteBookFound() {
        boolean result = manager.deleteBook("B002");
        assertTrue(result);
        assertNull(manager.searchBook("B002"));
    }

    @Test
    public void testDeleteBookNotFound() {
        boolean result = manager.deleteBook("B999");
        assertFalse(result);
    }

    @Test
    public void testBorrowAndReturnBook() {
        Book book = manager.searchBook("B001");
        assertNotNull(book);

        // Borrow the book
        book.borrowBook();
        assertTrue(book.isBorrowed());

        // Return the book
        book.returnBook();
        assertFalse(book.isBorrowed());
    }
}
