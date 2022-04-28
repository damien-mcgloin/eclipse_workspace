package challenge;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibrarySearchTest {
	
	//test data
	String ISBNValidB1;
	String ISBNValidB2;
	String ISBNValidB3;
	
	String titleValidB1 = "titleB1";
	String titleValidB2 = "titleB2";
	String titleValidB3 = "titleB3";
	
	String authorValidB1 = "authorB1";
	String authorValidB2 = "authorB2";
	String authorValidB3 = "authorB3";
	
	int ratingB1 = 1;
	int ratingB2 = 1;
	int ratingB3 = 3;
	
	Book b1;
	Book b2;
	Book b3;
	
	ArrayList<Book> allBooks;

	@BeforeEach
	void setUp() throws Exception {
		
		ISBNValidB1 = "ISBNVBOOK1";
		ISBNValidB2 = "ISBNVBOOK2";
		ISBNValidB3 = "ISBNVBOOK3";
		
		titleValidB1 = "titleB1";
		titleValidB2 = "titleB2";
		titleValidB3 = "titleB3";
		
		authorValidB1 = "authorB1";
		authorValidB2 = "authorB2";
		authorValidB3 = "authorB3";
		
		ratingB1 = 1;
		ratingB2 = 1;
		ratingB3 = 3;
		
		b1 = new Book(ISBNValidB1, authorValidB1, titleValidB1, ratingB1);
		b2 = new Book(ISBNValidB2, authorValidB2, titleValidB2, ratingB2);
		b3 = new Book(ISBNValidB3, authorValidB3, titleValidB3, ratingB3);
		
		allBooks = new ArrayList<Book>();
		
		allBooks.add(b1);
		allBooks.add(b2);
		allBooks.add(b3);
	}

	@Test
	void testSearchByISBN() {
		ArrayList<Book> results1 = LibrarySearch.searchByISBN(allBooks, ISBNValidB1);
		
		assertTrue(results1.contains(b1));
		
		ArrayList<Book> results2 = LibrarySearch.searchByISBN(allBooks, ISBNValidB2);
		
		assertTrue(results2.contains(b2));
		
		ArrayList<Book> results3 = LibrarySearch.searchByISBN(allBooks, ISBNValidB3);
		
		assertTrue(results3.contains(b3));
		
	}

	@Test
	void testSearchByAuthor() {
		ArrayList<Book> results1 = LibrarySearch.searchByAuthor(allBooks, authorValidB1);
		
		assertTrue(results1.contains(b1));
		
		ArrayList<Book> results2 = LibrarySearch.searchByAuthor(allBooks, authorValidB2);
		
		assertTrue(results2.contains(b2));
		
		ArrayList<Book> results3 = LibrarySearch.searchByAuthor(allBooks, authorValidB3);
		
		assertTrue(results3.contains(b3));
	}

	@Test
	void testSearchByTitle() {
		ArrayList<Book> results1 = LibrarySearch.searchByTitle(allBooks, titleValidB1);
		
		assertTrue(results1.contains(b1));
		
		ArrayList<Book> results2 = LibrarySearch.searchByTitle(allBooks, titleValidB2);
		
		assertTrue(results2.contains(b2));
		
		ArrayList<Book> results3 = LibrarySearch.searchByTitle(allBooks, titleValidB3);
		
		assertTrue(results3.contains(b3));
	}

	@Test
	void testSearchByRating() {
		ArrayList<Book> results1 = LibrarySearch.searchByRating(allBooks, ratingB1);
		
		assertTrue(results1.contains(b1));
		
		ArrayList<Book> results2 = LibrarySearch.searchByRating(allBooks, ratingB2);
		
		assertTrue(results2.contains(b2));
		
		ArrayList<Book> results3 = LibrarySearch.searchByRating(allBooks, ratingB3);
		
		assertTrue(results3.contains(b3));
	}

}
