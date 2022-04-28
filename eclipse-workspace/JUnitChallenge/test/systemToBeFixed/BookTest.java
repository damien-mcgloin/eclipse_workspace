package systemToBeFixed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

	// test data
	String ISBNValidUpper, ISBNValidLower, ISBNNotValid, 
	authorValid, authorNotValid, titleValid, titleNotValid;
	int ratingValid, ratingValidUpper, ratingValidLower, ratingNotValid;
	
	@BeforeEach
	void setUp() throws Exception {
		ISBNValidUpper = "xsf1234567899";
		ISBNValidLower = "xsf1234567";
		ISBNNotValid = "xsf123456";
		authorValid = "authorValid";
		authorNotValid = "";
		titleValid = "titleValid";
		titleNotValid = "";
		ratingValid = 3;
		ratingValidUpper = 5;
		ratingValidLower = 1;
		ratingNotValid = 0;
	}

	@Test
	void testBookDefaultConstructor() {
		Book book = new Book();
		assertNotNull(book);
	}

	@Test
	void testBookNonDefaultConstructor() {
		Book book = new Book(ISBNValidUpper, authorValid, titleValid, ratingValid);
		assertNotNull(book);
		
		assertEquals(ISBNValidUpper, book.getISBN());
		assertEquals(authorValid, book.getAuthor());
		assertEquals(titleValid, book.getTitle());
		assertEquals(ratingValid, book.getRating());
	}
	
	@Test
	void testBookNonDefaultConstructorInvalid() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			Book book = new Book(ISBNNotValid, authorValid, titleValid, ratingValid);
			book.toString();
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			Book book = new Book(ISBNValidUpper, authorNotValid, titleValid, ratingValid);
			book.toString();
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			Book book = new Book(ISBNValidUpper, authorValid, titleNotValid, ratingValid);
			book.toString();
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			Book book = new Book(ISBNValidUpper, authorValid, titleValid, ratingNotValid);
			book.toString();
		});
	}
	
	@Test
	void testGetSetISBNValidUpper() {
		Book book = new Book();
		book.setISBN(ISBNValidUpper);
		
		assertEquals(ISBNValidUpper, book.getISBN());
	}
	
	@Test
	void testGetSetISBNValidLower() {
		Book book = new Book();
		book.setISBN(ISBNValidLower);
		
		assertEquals(ISBNValidLower, book.getISBN());
	}
	
	@Test
	void testSetISBNNotValid() {
		Book book = new Book();
		assertThrows(IllegalArgumentException.class, () -> {
			book.setISBN(ISBNNotValid);
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
			book.setISBN(authorNotValid);
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
	void testGetSetRatingValidLower() {
		Book book = new Book();
		book.setRating(ratingValidLower);
		
		assertEquals(ratingValidLower, book.getRating());
	}
	
	@Test
	void testGetSetRatingValidUpper() {
		Book book = new Book();
		book.setRating(ratingValidUpper);
		assertEquals(ratingValidUpper, book.getRating());
	}
	
	@Test
	void testSetRatingNotValid() {
		Book book = new Book();
		
		assertThrows(IllegalArgumentException.class, () -> {
			book.setRating(ratingNotValid);
		});
	}

}
