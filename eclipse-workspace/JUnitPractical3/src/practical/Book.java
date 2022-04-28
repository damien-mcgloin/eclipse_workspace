package practical;

public class Book {

	private final int LOWER_RATING = 1;
	private final int UPPER_RATING = 5;
	private final int ISBN_LOW = 10;
	private final int ISBN_HIGH = 13;

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
	public void setISBN(String ISBN) throws IllegalArgumentException {
		if (ISBN.length() == ISBN_LOW || ISBN.length() == ISBN_HIGH) {
			this.ISBN = ISBN;
		} else {
			throw new IllegalArgumentException("ISBN not valid");
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
		if (author.length() >= 1) {
			this.author = author;
		} else {
			throw new IllegalArgumentException("Author not valid");
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
		if (title.length() >= 1) {
			this.title = title;
		} else {
			throw new IllegalArgumentException("Title not valid");
		}
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) throws IllegalArgumentException {
		if (rating >= LOWER_RATING && rating <= UPPER_RATING) {
			this.rating = rating;
		} else {
			throw new IllegalArgumentException("Rating not valid");
		}
	}
}
