package challenge;

public class Book {

	public static final int LOWER_ISBN = 10;
	public static final int UPPER_ISBN = 13;
	public static final int LOWER_RATING = 1;
	public static final int UPPER_RATING = 5;
	
	/**
	 * The book's ISBN
	 */
	private String ISBN;

	/**
	 * The autor of the book
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
	
	/**
	 * Default constructor
	 */
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
	 * error message primarily for traceability
	 * @param iSBN 10 or 13 chars
	 * @throws Exception
	 */
	public void setISBN(String ISBN) throws IllegalArgumentException {
		if(ISBN.length()==LOWER_ISBN || ISBN.length()==UPPER_ISBN) {
		this.ISBN = ISBN;
		} else {
			throw new IllegalArgumentException("Error - invalid ISBN length");
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
		if(author.length()>=1) {
		this.author = author;
		} else {
			throw new IllegalArgumentException("Error - invalid author length");
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
		if(title.length()>=1) {
		this.title = title;
		} else {
			throw new IllegalArgumentException("Error - Invalid title length");
		}

	}

	/**
	 * gets the book's rating
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * sets the book's rating
	 * @param rating the rating to set
	 */
	public void setRating(int rating) throws IllegalArgumentException {
		if(rating>=LOWER_RATING && rating<=UPPER_RATING) {
		this.rating = rating;
		} else {
			throw new IllegalArgumentException("Error - invalid rating");
		}
	}

}