package challenge;

public class Book {

	private final int LOWEST_VALID_AUTHOR = 1;
	private final int LOWEST_VALID_TITLE = 1;
	private final int LOWER_VALID_ISBN = 10;
	private final int UPPER_VALID_ISBN = 13;
	private final int LOWEST_VALID_RATING = 1;
	private final int HIGHEST_VALID_RATING = 5;

	/**
	 * The book's ISBN
	 */
	private String ISBN;

	/**
	 * The author of the book
	 */
	private String author;

	/**
	 * The title of the book
	 */
	private String title;

	/**
	 * The rating of the book
	 */
	private int rating;

	/**
	 * Default constructor
	 */
	public Book() {

	}

	public Book(String ISBN, String author, String title, int rating) {
		this.setISBN(ISBN);
		this.setAuthor(author);
		this.setTitle(title);
		this.setRating(rating);
	}

	/**
	 * Gets the ISBN number
	 * 
	 * @return
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Sets the ISBN number
	 * 
	 * @param iSBN 10 or 13 chars
	 * @throws Exception
	 */
	public void setISBN(String ISBN) {
		if(ISBN.length() == LOWER_VALID_ISBN || ISBN.length() == UPPER_VALID_ISBN) {
		this.ISBN = ISBN;
		} else {
			throw new IllegalArgumentException("Invalid ISBN length");
		}
	}

	/**
	 * Get the book's author
	 * 
	 * @return
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the book's author
	 * 
	 * @param author
	 */
	public void setAuthor(String author) throws IllegalArgumentException {
		if (author.length() >= LOWEST_VALID_AUTHOR) {
			this.author = author;
		} else {
			throw new IllegalArgumentException("Invalid author length");
		}
	}

	/**
	 * Gets the book's title
	 * 
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the books title
	 * 
	 * @param title
	 */
	public void setTitle(String title) throws IllegalArgumentException {
		if (title.length() >= LOWEST_VALID_TITLE) {
			this.title = title;
		} else {
			throw new IllegalArgumentException("Invalid title length");
		}
	}

	/**
	 * 
	 * @return the rating of the book
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * sets the book's rating
	 * 
	 * @param rating
	 */
	public void setRating(int rating) throws IllegalArgumentException {
		if (rating >= LOWEST_VALID_RATING && rating <= HIGHEST_VALID_RATING) {
			this.rating = rating;
		} else {
			throw new IllegalArgumentException("Invalid rating");
		}
	}
}
