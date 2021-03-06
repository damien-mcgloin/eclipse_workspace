package amazon2;

public class AmazonBook {

	private String title;
	private String author;
	private double price;
	private int pages;
	private String ISBN10;
	private int rating;
	private String language;

	public AmazonBook() {

	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * @param pages the pages to set
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}

	/**
	 * @return the iSBN10
	 */
	public String getISBN10() {
		return ISBN10;
	}

	/**
	 * @param iSBN10 the iSBN10 to set
	 */
	public void setISBN10(String iSBN10) {
		ISBN10 = iSBN10;
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
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	public AmazonBook(String title, String author, double price, int pages, String iSBN10, int rating,
			String language) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.pages = pages;
		ISBN10 = iSBN10;
		this.rating = rating;
		this.language = language;
	}

}
