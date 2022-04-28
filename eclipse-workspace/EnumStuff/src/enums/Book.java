package enums;

public class Book {
	
	private String name;
	private Genre genre;
	
	public Book() {
		
	}
	
	public Book(String name, Genre genre) {
		this.name = name;
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
		this.name = name;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

}
