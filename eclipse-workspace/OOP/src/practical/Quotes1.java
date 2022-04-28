package practical;

/**
 * This class will output some quotes
 * @author damienmcgloin
 *
 */
public class Quotes1 {
	
	public void shakespeareQuote() {
		
		System.out.println("Shakespeare");
		
	}
	
	public void oscarWildeQuote() {
		
		System.out.println("Oscar Wilde");
		
	}
	
	public void churchillQuote() {
		
		System.out.println("Churchill");
		
	}
	
	public void georgeWBushQuote() {
		
		System.out.println("George W Bush");
		
	}
	
	/**
	 * ad hoc testing of class
	 * @param args
	 */
	public static void main(String args[]) {
		
		// create an instance of class to be tested
		Quotes1 quotes = new Quotes1();
		
		quotes.shakespeareQuote();
		quotes.oscarWildeQuote();
		
	}

}
