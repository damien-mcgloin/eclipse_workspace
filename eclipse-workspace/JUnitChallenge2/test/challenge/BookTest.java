package challenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

	// Test data
	int ratingValid, ratingLowerValid, ratingUpperValid, ratingNotValid, ratingNotValidLower, ratingNotValidUpper;
	String ISBNLowerValid, ISBNUpperValid, ISBNLowerNotValid, ISBNUpperNotValid, authorValid, authorNotValid,
			titleValid, titleNotValid;
	Book book;

	@BeforeEach
	void setUp() throws Exception {
		ratingValid = 3;
		ratingLowerValid = 1;
		ratingUpperValid = 5;
		ratingNotValid = -5;
		ratingNotValidLower = 0;
		ratingNotValidUpper = 6;

		ISBNLowerValid = "ISBN123456";
		ISBNUpperValid = "ISBN123456789";
		ISBNLowerNotValid = "ISBN12345";
		ISBNUpperNotValid = "ISBN1234567890";

		authorValid = "authorValid";
		authorNotValid = "";
		titleValid = "titleValid";
		titleNotValid = "";
		
		book = new Book();
	}

	@Test
	void testBookDefaultConstructor() {
		Book book = new Book();
		assertNotNull(book);
	}

	@Test
	void testBookNotDefaultConstructor() {
		Book book = new Book(ISBNUpperValid, authorValid, titleValid, ratingValid);

		assertEquals(ISBNUpperValid, book.getISBN());
		assertEquals(authorValid, book.getAuthor());
		assertEquals(titleValid, book.getTitle());
		assertEquals(ratingValid, book.getRating());
	}

	@Test
	void testBookNotDefaultConstructorInvalid() {

		assertThrows(IllegalArgumentException.class, () -> {
			Book book = new Book(ISBNUpperNotValid, authorValid, titleValid, ratingValid);
			assertEquals(ISBNUpperNotValid, book.getTitle());
		});

		assertThrows(IllegalArgumentException.class, () -> {
			Book book = new Book(titleValid, authorNotValid, titleValid, ratingValid);
			assertEquals(authorNotValid, book.getTitle());
		});

		assertThrows(IllegalArgumentException.class, () -> {
			Book book = new Book(titleValid, authorValid, titleNotValid, ratingValid);
			assertEquals(titleNotValid, book.getTitle());
		});

		assertThrows(IllegalArgumentException.class, () -> {
			Book book = new Book(titleValid, authorValid, titleValid, ratingNotValid);
			assertEquals(ratingNotValid, book.getTitle());
		});
	}
	
	@Test
	void testGetSetISBNLowerValid() {
		Book book = new Book();
		book.setISBN(ISBNLowerValid);

		assertEquals(ISBNLowerValid, book.getISBN());
	}

	@Test
	void testGetSetISBNUpperValid() {
		Book book = new Book();
		book.setISBN(ISBNUpperValid);

		assertEquals(ISBNUpperValid, book.getISBN());
	}

	@Test
	void testSetISBNLowerNotValid() {
		Book book = new Book();

		assertThrows(IllegalArgumentException.class, () -> {
			book.setISBN(ISBNLowerNotValid);
		});

	}

	@Test
	void testSetISBNUpperNotValid() {
		Book book = new Book();

		assertThrows(IllegalArgumentException.class, () -> {
			book.setISBN(ISBNUpperNotValid);
		});
	}

	@Test
	void testGetSetAuthorValid() {
		Book book = new Book();
		book.setAuthor(authorValid);

		assertEquals(authorValid, book.getAuthor());
	}

	@Test
	void testSetAuthorNotValid() {
		Book book = new Book();

		assertThrows(IllegalArgumentException.class, () -> {
			book.setAuthor(authorNotValid);
		});
	}

	@Test
	void testGetSetTitleValid() {
		Book book = new Book();
		book.setTitle(titleValid);

		assertEquals(titleValid, book.getTitle());
	}

	@Test
	void testSetTitleNotValid() {
		Book book = new Book();

		assertThrows(IllegalArgumentException.class, () -> {
			book.setTitle(titleNotValid);
		});
	}

	@Test
	void testGetSetRatingValid() {
		Book book = new Book();
		book.setRating(ratingValid);

		assertEquals(ratingValid, book.getRating());
	}

	@Test
	void testGetSetRatingLowerValid() {
		Book book = new Book();
		book.setRating(ratingLowerValid);

		assertEquals(ratingLowerValid, book.getRating());
	}

	@Test
	void testGetSetRatingUpperValid() {
		Book book = new Book();
		book.setRating(ratingUpperValid);

		assertEquals(ratingUpperValid, book.getRating());
	}

	@Test
	void testSetRatingNotValidLower() {
		Book book = new Book();

		assertThrows(IllegalArgumentException.class, () -> {
			book.setRating(ratingNotValidLower);
		});
	}

	@Test
	void testSetRatingNotValidUpper() {
		Book book = new Book();

		assertThrows(IllegalArgumentException.class, () -> {
			book.setRating(ratingNotValidUpper);
		});
	}

}
