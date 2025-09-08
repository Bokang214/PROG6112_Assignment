package library_manage;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryManagerTest {
    private LibraryManager manager;

    @Before
    public void setUp() {
        manager = new LibraryManager();
        manager.addBook(new Book("B001", "Java Basics", "James Gosling"));
    }

    @Test
    public void testSearchBook_Found() {
        Book b = manager.searchBook("B001");
        assertNotNull("Book should be found", b);
        assertEquals("Java Basics", b.getTitle());
    }

    @Test
    public void testSearchBook_NotFound() {
        Book b = manager.searchBook("B999");
        assertNull("Book should not be found", b);
    }

    @Test
    public void testAddBook() {
        manager.addBook(new Book("B002", "Advanced Java", "Herbert Schildt"));
        assertEquals("There should be 2 books", 2, manager.getBooks().size());
        assertNotNull("Newly added book should be found", manager.searchBook("B002"));
    }

    @Test
    public void testDeleteBook_Found() {
        assertTrue("Delete should succeed", manager.deleteBook("B001"));
        assertNull("Book should be deleted", manager.searchBook("B001"));
    }

    @Test
    public void testDeleteBook_NotFound() {
        assertFalse("Delete should fail", manager.deleteBook("B888"));
    }
}
