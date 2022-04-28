package amazon;

import java.util.ArrayList;

public class AmazonWebApp {

	public static void main(String[] args) {
		
		AmazonBook b1 = new AmazonBook("The Body", "Bill Bryson", 17.08, 464, "0857522418", 4.7, "English");
		AmazonBook b2 = new AmazonBook("Ulysses", "James Joyce", 2.25, 736, "1840226358", 4.4, "English");
		
		ArrayList<AmazonBook> books = new ArrayList<AmazonBook>();
		
		books.add(b1);
		books.add(b2);
		
		longestBook(books);
		
	}
	
	public static void longestBook(ArrayList<AmazonBook> books) {
		
		int pages = books.get(0).getPages();
		String title = books.get(0).getTitle();
		
		for(int loop = 0; loop<books.size(); loop++) {
			if(books.get(loop).getPages()>pages) {
				pages = books.get(loop).getPages();
				title = books.get(loop).getTitle();
			}
		}
		
		System.out.println("The book with the most pages is : "+title);
		
	}

}
