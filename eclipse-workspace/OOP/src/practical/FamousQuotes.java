package practical;

public class FamousQuotes {
	
	public void shakespeareQuote() {
		System.out.println("Good night, good night! Parting is such sweet sorrow, that I shall say good night till it be morrow. Shakespeare");
	}
	
	public void oscarWildeQuote() {
		System.out.println("Experience is simply the name we give our mistakes. Wilde");
	}
	
	public void churchillQuote() {
		System.out.println("Continuous effort - not strength or intelligence - is the key to unlocking our potential. Churchill");
	}
	
	public void georgeWBushQuote() {
		System.out.println("One of the great things about books is sometimes there are some fantastic pictures");
	}
	
	public static void main(String args[]) {
		
		FamousQuotes quotes = new FamousQuotes();
		quotes.shakespeareQuote();
		quotes.oscarWildeQuote();
		quotes.churchillQuote();
		quotes.georgeWBushQuote();
		
	}

}
