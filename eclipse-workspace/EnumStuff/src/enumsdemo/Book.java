/**
 * 
 */
package enumsdemo;

/**
 * @author damienmcgloin
 *
 */
public class Book {

	private static final int BOOK_NAME_LOWER_LIMIT = 0;
	private static final int BOOK_NAME_UPPER_LIMIT = 255;
	
	// instance vars
	private String name;
	private Genre genre;
	
	// constructors
	
	/**
	 * creates a book via the default constructor
	 */
	public Book() {
		
	}
	
	/**
	 * 
	 * @param name
	 * @param genre
	 */
	public Book(String name, Genre genre) {
		this.setName(name);
		this.genre = genre;
	}
	
	// methods
	
	/**
	 * @return the genre
	 */
	public Genre getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if (name!=null && name.trim().length() > BOOK_NAME_LOWER_LIMIT && name.length() <= BOOK_NAME_UPPER_LIMIT) {
		this.name = name;
		} else {
			System.out.println("Book name is too long ..");
		}
	}
	
}
