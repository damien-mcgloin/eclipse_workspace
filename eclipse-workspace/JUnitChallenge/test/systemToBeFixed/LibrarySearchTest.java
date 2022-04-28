package systemToBeFixed;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibrarySearchTest {

	// Test data structures - books, etc.

	// some books
	Book b1, b2, b3;

	String authorB1, authorB2, authorB3;
	String ISBNB1, ISBNB2, ISBNB3;

	String titleB1, titleB2, titleB3;

	int ratingB1, ratingB2, ratingB3;

	// the arraylist of books structure
	ArrayList<Book> allBooks;

	@BeforeEach
	void setUp() throws Exception {
		// crate some books with test data
		authorB1 = "B1Author";
		authorB2 = "B2Author";
		authorB3 = "B3Author";

		titleB1 = "B1Title";
		titleB2 = "B2Title";
		titleB3 = "B3Title";
		
		ISBNB1 = "ISBNB1AAAA";
		ISBNB2 = "ISBNB2AAAA";
		ISBNB3 = "ISBNB3AAAA";

		ratingB1 = 1;
		ratingB2 = 1;
		ratingB3 = 3;

		// create the test book objects
		b1 = new Book(ISBNB1, authorB1, titleB1, ratingB1);
		b2 = new Book(ISBNB2, authorB2, titleB2, ratingB2);
		b3 = new Book(ISBNB3, authorB3, titleB3, ratingB3);

		// create the array list of books
		allBooks = new ArrayList<Book>();

		// add the book to the list
		allBooks.add(b1);
		allBooks.add(b2);
		allBooks.add(b3);
	}

	@Test
	void testSearchByTitle() {

		ArrayList<Book> allBooks = new ArrayList<Book>();
		
		allBooks.add(b1);
		allBooks.add(b2);
		allBooks.add(b3);
		
		ArrayList<Book> results = LibrarySearch.searchByTitle(allBooks, titleB1);

		if (results.contains(b1)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}

	}

	@Test
	void testSearchByAuthor() {

		ArrayList<Book> results = LibrarySearch.searchByAuthor(allBooks, authorB1);

		if (results.contains(b1)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
		
		assertTrue(results.contains(b1));
	}

	@Test
	void testSearchByISBN() {

		ArrayList<Book> results = LibrarySearch.searchByISBN(allBooks, ISBNB1);

		if (results.contains(b1)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

	@Test
	void testSearchByRating() {

		ArrayList<Book> results = LibrarySearch.searchByRating(allBooks, ratingB1);
 
		if (results.contains(b1)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

}
