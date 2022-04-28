package amazon;

public class AmazonBook {
	
	private String title;
	private String author;
	private double price;
	private int pages;
	private String ISBN10;
	private double customerRating;
	private String language;
	
	public AmazonBook() {
		
	}
	
	public AmazonBook(String title, String author, double price, int pages, String ISBN10,
			double customerRating, String language) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.pages = pages;
		this.ISBN10 = ISBN10;
		this.customerRating = customerRating;
		this.language = language;
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
	 * @return the customerRating
	 */
	public double getCustomerRating() {
		return customerRating;
	}

	/**
	 * @param customerRating the customerRating to set
	 */
	public void setCustomerRating(double customerRating) {
		this.customerRating = customerRating;
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

	@Override
	public String toString() {
		return "AmazonBook [title=" + title + ", author=" + author + ", price=" + price + ", pages=" + pages
				+ ", ISBN10=" + ISBN10 + ", customerRating=" + customerRating + ", language=" + language + "]";
	}

}
