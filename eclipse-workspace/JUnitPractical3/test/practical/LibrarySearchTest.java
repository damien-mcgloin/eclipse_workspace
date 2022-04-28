package practical;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibrarySearchTest {

	// test data
	ArrayList<Book> arrayList;
		
	String ISBNB1;
	String ISBNB2;
	String ISBNB3;
	
	String authorB1;
	String authorB2;
	String authorB3;
	
	String titleB1;
	String titleB2;
	String titleB3;
	
	int ratingB1;
	int ratingB2;
	int ratingB3;
	
	Book b1;
	Book b2;
	Book b3;
	
	@BeforeEach
	void setUp() throws Exception {
		ISBNB1 = "ISBNValid1";
		ISBNB2 = "ISBNValid2";
		ISBNB3 = "ISBNValid3";
		
		authorB1 = "authorValidB1";
		authorB2 = "authorValidB2";
		authorB3 = "authorValidB3";
		
		titleB1 = "titleValidB1";
		titleB2 = "titleValidB2";
		titleB3 = "titleValidB3";
		
		ratingB1 = 1;
		ratingB2 = 1;
		ratingB3 = 3;
		
		b1 = new Book(ISBNB1, authorB1, titleB1, ratingB1);
		b2 = new Book(ISBNB2, authorB2, titleB2, ratingB2);
		b3 = new Book(ISBNB3, authorB3, titleB3, ratingB3);
		
		arrayList = new ArrayList<Book>();
		
		arrayList.add(b1);
		arrayList.add(b2);
		arrayList.add(b3);
	}

	@Test
	void testSearchByTitle() {
		ArrayList<Book> results = LibrarySearch.searchByTitle(arrayList, titleB1);
		
		if(results.contains(b1)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
		
		assertTrue(results.contains(b1));
	}

	@Test
	void testSearchByISBN() {
		ArrayList<Book> results = LibrarySearch.searchByISBN(arrayList, ISBNB1);
		
		if(results.contains(b1)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
		
		assertTrue(results.contains(b1));
	}

	@Test
	void testSearchByAuthor() {
		ArrayList<Book> results = LibrarySearch.searchByAuthor(arrayList, authorB1);
		
		if(results.contains(b1)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
		
		assertTrue(results.contains(b1));
	}

	@Test
	void testSearchByRating() {
		ArrayList<Book> results = LibrarySearch.searchByRating(arrayList, ratingB1);
		
		if(results.contains(b1)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
		
		assertTrue(results.contains(b1));
	}

}
