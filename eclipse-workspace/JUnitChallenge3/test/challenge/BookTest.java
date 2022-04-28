package challenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

	// test data
	String ISBNLowValid, ISBNHighValid, ISBNLowInvalid, ISBNHighInvalid, authorValid, authorInvalid, titleValid,
			titleInvalid;
	int ratingLowValid, ratingMidValid, ratingHighValid, ratingLowInvalid, ratingHighInvalid;
	Book book;

	@BeforeEach
	void setUp() throws Exception {
		ISBNLowValid = "ISBNValid1";
		ISBNHighValid = "ISBNValid1234";
		ISBNLowInvalid = "Invalid12";
		ISBNHighInvalid = "ISBNINValid123";

		authorValid = "author";
		authorInvalid = "";
		titleValid = "title";
		titleInvalid = "";

		ratingLowValid = 1;
		ratingMidValid = 3;
		ratingHighValid = 5;
		ratingLowInvalid = 0;
		ratingHighInvalid = 6;

		book = new Book();
	}

	@Test
	void testBookDefaultConstructor() {
		assertNotNull(book);
	}

	@Test
	void testBookNonDefaultConstructorValid() {
		book.setISBN(ISBNHighValid);
		assertEquals(ISBNHighValid, book.getISBN());

		book.setAuthor(authorValid);
		assertEquals(authorValid, book.getAuthor());

		book.setTitle(titleValid);
		assertEquals(titleValid, book.getTitle());

		book.setRating(ratingMidValid);
		assertEquals(ratingMidValid, book.getRating());
	}

	@Test
	void testBookNonDefaultConstructorNotValid() {

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			book = new Book(ISBNHighInvalid, authorValid, titleValid, ratingHighValid);
			assertEquals(ISBNHighInvalid, book.getISBN());
		});

		assertEquals("Invalid ISBN length", exception.getMessage());

		IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> {
			book = new Book(ISBNHighValid, authorInvalid, titleValid, ratingHighValid);
		});

		assertEquals("Invalid author length", exception1.getMessage());

		IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> {
			book = new Book(ISBNHighValid, authorValid, titleInvalid, ratingHighValid);
		});

		assertEquals("Invalid title length", exception2.getMessage());

		IllegalArgumentException exception3 = assertThrows(IllegalArgumentException.class, () -> {
			book = new Book(ISBNHighValid, authorValid, titleValid, ratingHighInvalid);
		});

		assertEquals("Invalid rating", exception3.getMessage());

	}

	@Test
	void testGetSetISBNValid() {
		book.setISBN(ISBNLowValid);
		assertEquals(ISBNLowValid, book.getISBN());

		book.setISBN(ISBNHighValid);
		assertEquals(ISBNHighValid, book.getISBN());
	}

	@Test
	void testSetISBNInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			book.setISBN(ISBNHighInvalid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			book.setISBN(ISBNLowInvalid);
		});
	}

	@Test
	void testGetSetAuthorValid() {
		book.setAuthor(authorValid);
		assertEquals(authorValid, book.getAuthor());
	}

	@Test
	void testSetAuthorInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			book.setAuthor(authorInvalid);
		});
	}

	@Test
	void testGetSetTitleValid() {
		book.setTitle(titleValid);
		assertEquals(titleValid, book.getTitle());
	}

	@Test
	void testSetTitleInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			book.setTitle(titleInvalid);
		});
	}

	@Test
	void testGetSetRatingValid() {
		book.setRating(ratingHighValid);
		assertEquals(ratingHighValid, book.getRating());

		book.setRating(ratingMidValid);
		assertEquals(ratingMidValid, book.getRating());

		book.setRating(ratingLowValid);
		assertEquals(ratingLowValid, book.getRating());
	}

	@Test
	void testSetRatingInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			book.setRating(ratingLowInvalid);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			book.setRating(ratingHighInvalid);
		});
	}

}
