package challenge;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibrarySearchTest {

	// test data
	String ISBNBook1, ISBNBook2, ISBNBook3;
	String authorBook1, authorBook2, authorBook3;
	String titleBook1, titleBook2, titleBook3;
	int ratingBook1, ratingBook2, ratingBook3;
	
	ArrayList<Book> allBooks;
	
	Book b1;
	Book b2; 
	Book b3;
	
	@BeforeEach
	void setUp() throws Exception {
		ISBNBook1 = "ISBNBook12";
		ISBNBook2 = "ISBNBook23";
		ISBNBook3 = "ISBNBook34";
		
		authorBook1 = "authorB1";
		authorBook2 = "authorB2";
		authorBook3 = "authorB3";
		
		titleBook1 = "titleB1";
		titleBook2 = "titleB2";
		titleBook3 = "titleB3";
		
		ratingBook1 = 1;
		ratingBook2 = 1;
		ratingBook3 = 3;
		
		b1 = new Book(ISBNBook1, authorBook1, titleBook1, ratingBook1);
		b2 = new Book(ISBNBook2, authorBook2, titleBook2, ratingBook2);
		b3 = new Book(ISBNBook3, authorBook3, titleBook3, ratingBook3);	
		
		allBooks = new ArrayList<Book>();
		
		allBooks.add(b1);
		allBooks.add(b2);
		allBooks.add(b3);
	}

	@Test
	void testSearchByTitle() {
		ArrayList<Book> results = LibrarySearch.searchByTitle(allBooks, titleBook1);
		
		if(results.contains(b1)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
		
		ArrayList<Book> results2 = LibrarySearch.searchByTitle(allBooks, titleBook2);
		
		if(results2.contains(b2)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

	@Test
	void testSearchByAuthor() {
		ArrayList<Book> results = LibrarySearch.searchByAuthor(allBooks, authorBook1);
		
		if(results.contains(b1)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

	@Test
	void testSearchByISBN() {
		ArrayList<Book> results = LibrarySearch.searchByISBN(allBooks, ISBNBook1);
		
		if(results.contains(b1)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

	@Test
	void testSearchByRating() {
		ArrayList<Book> results = LibrarySearch.searchByRating(allBooks, ratingBook1);
		
		if(results.contains(b1)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}
}
