package cz.engeto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private final static String JAVA_PROGRAMMING = "Java Programming";
    private final static String PYTHON_PROGRAMMING = "Python Programming";

    @BeforeEach
    void setUp() {
        library = new Library();
        book1 = new Book(JAVA_PROGRAMMING);
        book2 = new Book(PYTHON_PROGRAMMING);
        library.addBook(book1);
        library.addBook(book2);
    }

    @Test
    void addBook() {
//        String name = "C++ Programming";
        Book book = new Book("C++ Programing");
        library.addBook(book);

        assertEquals(book, library.findBook("C++ Programming"));
    }

    @Test
    void removeBook() {
        library.removeBook(JAVA_PROGRAMMING);
        assertNull(library.findBook(JAVA_PROGRAMMING));
    }


    @Test
    void findBook() {
        assertEquals(book1, library.findBook(JAVA_PROGRAMMING));
    }

    @Test
    void borrowBook() {
        library.borrowBook(PYTHON_PROGRAMMING);
        assertTrue(library.findBook(PYTHON_PROGRAMMING).isBorrowed());
    }

    @Test
    void returnBook() {
        library.borrowBook(PYTHON_PROGRAMMING);
        library.returnBook(PYTHON_PROGRAMMING);
        assertFalse(library.findBook(PYTHON_PROGRAMMING).isBorrowed());
    }
}