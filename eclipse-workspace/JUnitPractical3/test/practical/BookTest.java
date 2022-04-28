package practical;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

	// test data
	String ISBNLowerValid, ISBNUpperValid, ISBNLowerInvalid, ISBNUpperInvalid, authorValid, authorLowerValid,
			authorInvalid, titleValid, titleLowerValid, titleInvalid;
	int lowerValidRating, midValidRating, upperValidRating, lowerInvalidRating, upperInvalidRating;

	Book book;

	@BeforeEach
	void setUp() throws Exception {
		ISBNLowerValid = "ISBNValid1";
		ISBNUpperValid = "ISBNValid1234";
		ISBNLowerInvalid = "NotValid1";
		ISBNUpperInvalid = "NotValid123456";

		authorValid = "authorValid";
		authorLowerValid = "a";
		authorInvalid = "";

		titleValid = "titleValid";
		titleLowerValid = "t";
		titleInvalid = "";

		lowerValidRating = 1;
		midValidRating = 3;
		upperValidRating = 5;
		lowerInvalidRating = 0;
		upperInvalidRating = 6;

		book = new Book();
	}

	@Test
	void testDefaultConstructor() {
		assertNotNull(book);
	}

	@Test
	void testNonDefaultConstructor() {
		book = new Book(ISBNLowerValid, authorValid, titleValid, midValidRating);

		assertEquals(ISBNLowerValid, book.getISBN());
		assertEquals(authorValid, book.getAuthor());
		assertEquals(titleValid, book.getTitle());
		assertEquals(midValidRating, book.getRating());
	}

	@Test
	void testNonDefaultConstructorInvalid() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			book = new Book(ISBNLowerInvalid, authorValid, titleValid, midValidRating);
		});
		assertEquals("ISBN not valid", exception.getMessage());

		exception = assertThrows(IllegalArgumentException.class, () -> {
			book = new Book(ISBNLowerValid, authorInvalid, titleValid, midValidRating);
		});
		assertEquals("Author not valid", exception.getMessage());

		exception = assertThrows(IllegalArgumentException.class, () -> {
			book = new Book(ISBNLowerValid, authorValid, titleInvalid, midValidRating);
		});
		assertEquals("Title not valid", exception.getMessage());

		exception = assertThrows(IllegalArgumentException.class, () -> {
			book = new Book(ISBNLowerValid, authorValid, titleValid, lowerInvalidRating);
		});
		assertEquals("Rating not valid", exception.getMessage());

	}

	@Test
	void testGetSetISBNValid() {
		book.setISBN(ISBNLowerValid);
		assertEquals(ISBNLowerValid, book.getISBN());

		book.setISBN(ISBNUpperValid);
		assertEquals(ISBNUpperValid, book.getISBN());
	}

	@Test
	void testSetISBNInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			book.setISBN(ISBNLowerInvalid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			book.setISBN(ISBNUpperInvalid);
		});
	}

	@Test
	void testGetSetAuthor() {
		book.setAuthor(authorValid);
		assertEquals(authorValid, book.getAuthor());

		book.setAuthor(authorLowerValid);
		assertEquals(authorLowerValid, book.getAuthor());
	}

	@Test
	void testSetAuthorInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			book.setAuthor(authorInvalid);
		});
	}

	@Test
	void testGetSetTitle() {
		book.setTitle(titleValid);
		assertEquals(titleValid, book.getTitle());

		book.setTitle(titleLowerValid);
		assertEquals(titleLowerValid, book.getTitle());
	}

	@Test
	void testSetTitleInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			book.setTitle(titleInvalid);
		});
	}

	@Test
	void testGetSetRatingValid() {
		book.setRating(lowerValidRating);
		assertEquals(lowerValidRating, book.getRating());

		book.setRating(midValidRating);
		assertEquals(midValidRating, book.getRating());

		book.setRating(upperValidRating);
		assertEquals(upperValidRating, book.getRating());
	}

	@Test
	void testSetRatingInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			book.setRating(lowerInvalidRating);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			book.setRating(upperInvalidRating);
		});
	}

}
