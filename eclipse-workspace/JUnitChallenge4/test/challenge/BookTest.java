package challenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

	// test data
	String ISBNValid, ISBNInvalid, authorValid, authorInvalid, titleValid, titleInvalid;
	int ratingValid, ratingInvalid;
	Book book;

	@BeforeEach
	void setUp() throws Exception {
		ISBNValid = "ISBNValid1";
		ISBNInvalid = "ISBNValid";
		authorValid = "authorValid";
		authorInvalid = "";
		titleValid = "titleValid";
		titleInvalid = "";
		ratingValid = 1;
		ratingInvalid = 6;

		book = new Book();
	}

	@Test
	void testBookDefaultConstructorValid() {
		assertNotNull(book);
	}

	@Test
	void testBookNonDefaultConstructorValid() {
		book = new Book(ISBNValid, authorValid, titleValid, ratingValid);

		assertEquals(ISBNValid, book.getISBN());
		assertEquals(authorValid, book.getAuthor());
		assertEquals(titleValid, book.getTitle());
		assertEquals(ratingValid, book.getRating());
	}

	@Test
	void testBookNonDefaultConstructorNotValid() {
		assertThrows(IllegalArgumentException.class, () -> {
			book = new Book(ISBNInvalid, authorValid, titleValid, ratingValid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			book = new Book(ISBNValid, authorInvalid, titleValid, ratingValid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			book = new Book(ISBNValid, authorValid, titleInvalid, ratingValid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			book = new Book(ISBNValid, authorValid, titleValid, ratingInvalid);
		});
	}

	@Test
	void testGetSetISBNValid() {
		book.setISBN(ISBNValid);

		assertEquals(ISBNValid, book.getISBN());
	}

	@Test
	void testSetISBNNotValid() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			book.setISBN(ISBNInvalid);
		});
		
		assertEquals("Invalid ISBN length", exception.getMessage());
	}

	@Test
	void testGetSetAuthorValid() {
		book.setAuthor(authorValid);

		assertEquals(authorValid, book.getAuthor());
	}

	@Test
	void testSetAuthorNotValid() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			book.setAuthor(authorInvalid);
		});
		
		assertEquals("Invalid author length", exception.getMessage());
	}

	@Test
	void testGetSetTitleValid() {
		book.setTitle(titleValid);

		assertEquals(titleValid, book.getTitle());
	}

	@Test
	void testSetTitleNotValid() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			book.setTitle(titleInvalid);
		});
		
		assertEquals("Invalid title length", exception.getMessage());
	}

	@Test
	void testGetSetRatingValid() {
		book.setRating(ratingValid);

		assertEquals(ratingValid, book.getRating());
	}

	@Test
	void testSetRatingNotValid() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			book.setRating(ratingInvalid);
		});
		
		assertEquals("Invalid rating", exception.getMessage());
	}

}
