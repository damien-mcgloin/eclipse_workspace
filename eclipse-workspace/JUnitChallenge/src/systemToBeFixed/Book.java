package systemToBeFixed;

/**
 * Book class - represents a book in the system
 * 
 * @author amcgowan
 */
public class Book {

	/**
	 * The book's ISBN
	 */
	private String ISBN;

	/**
	 * The autohr of the book
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
	
	private final int ISBN_LOW = 10;
	
	private final int ISBN_HIGH = 13;

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
			throw new IllegalArgumentException("The value is outside of the valid range");
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
		if (author.length() > 0) {
			this.author = author;
		} else {
			throw new IllegalArgumentException("Error - not enough characters entered");
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
		if(title.length()>0) {
		this.title = title;
		} else {
			throw new IllegalArgumentException("Error - not enough characters entered");
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
		if (rating >= 1 && rating <= 5) {
			this.rating = rating;
		} else {
			throw new IllegalArgumentException("Rating outside of valid range");
		}
	}
}
