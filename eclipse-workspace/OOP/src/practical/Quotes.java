package practical;

/**
 * This class will output several literary quotes
 * @author damienmcgloin
 *
 */
public class Quotes {
	
	public void shakespeareQuote() {
		System.out.println("Shakespeare");
	}
	
	public void wildeQuote() {
		System.out.println("Wilde");
	}
	
	/**
	 * Testing of methods of class
	 * @param args
	 */
	public static void main(String args[]) {
		
		// create an instance of the class to be tested
		Quotes quotes = new Quotes();
		quotes.shakespeareQuote();
		quotes.wildeQuote();
		
	}

}
