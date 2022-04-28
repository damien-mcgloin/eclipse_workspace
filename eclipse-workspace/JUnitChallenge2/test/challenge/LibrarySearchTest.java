package challenge;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibrarySearchTest {

	// test data

	ArrayList<Book> allBooks;

	Book b1, b2, b3;

	String titleB1;
	String titleB2;
	String titleB3;

	String authorB1;
	String authorB2;
	String authorB3;

	int ratingB1;
	int ratingB2;
	int ratingB3;

	String ISBNB1;
	String ISBNB2;
	String ISBNB3;

	@BeforeEach
	void setUp() throws Exception {
		titleB1 = "validTitle";
		titleB2 = "validTitle";
		titleB3 = "validTitle";

		authorB1 = "validAuthor";
		authorB2 = "validAuthor";
		authorB3 = "validAuthor";

		ratingB1 = 1;
		ratingB2 = 1;
		ratingB3 = 3;

		ISBNB1 = "ISBN123456789";
		ISBNB2 = "ISBN123456789";
		ISBNB3 = "ISBN123456789";

		b1 = new Book(ISBNB1, authorB1, titleB1, ratingB1);
		b2 = new Book(ISBNB2, authorB2, titleB2, ratingB2);
		b3 = new Book(ISBNB3, authorB3, titleB3, ratingB3);

		allBooks = new ArrayList<Book>();

		allBooks.add(b1);
		allBooks.add(b2);
		allBooks.add(b3);
	}

	@Test
	void testSearchByTitle() {
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

	@Test
	void testSearchByISBN() {
		ArrayList<Book> results = LibrarySearch.searchByISBN(allBooks, ISBNB1);

		if (results.contains(b1)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

}
