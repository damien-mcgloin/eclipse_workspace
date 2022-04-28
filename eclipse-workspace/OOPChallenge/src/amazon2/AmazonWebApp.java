package amazon2;

import java.util.ArrayList;

public class AmazonWebApp {
	
	public static ArrayList<AmazonBook> books = new ArrayList<AmazonBook>();

	public static void main(String[] args) {
		
		AmazonBook book1 = new AmazonBook("Harry P", "JKR", 10.50, 325, "SDFGHJ567", 4, "English");
		AmazonBook book2 = new AmazonBook("GOT", "G.R.R.M", 8.99, 190, "ASDFGH5678", 4, "English");
		AmazonBook book3 = new AmazonBook("abc", "G.R.R.M", 8.99, 80, "ASDFGH5678", 4, "English");
		AmazonBook book4 = new AmazonBook("def", "G.R.R.M", 8.99, 890, "ASDFGH5678", 4, "English");
		AmazonBook book5 = new AmazonBook("ghi", "G.R.R.M", 8.99, 1890, "ASDFGH5678", 4, "English");
		AmazonBook book6 = new AmazonBook("jkl", "G.R.R.M", 8.99, 80090, "ASDFGH5678", 4, "English");
		AmazonBook book7 = new AmazonBook("mno", "G.R.R.M", 8.99, 80090, "ASDFGH5678", 4, "English");
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		books.add(book7);
		
		compareBookLength(books);

	}
	
	public static void compareBookLength(ArrayList<AmazonBook> books) {
		
		int length = books.get(0).getPages();
		String bookName = books.get(0).getTitle();
		
		for(int loop=0; loop<books.size(); loop++) {
			if(length<books.get(loop).getPages()) {
				length = books.get(loop).getPages();
				bookName = books.get(loop).getTitle();
			}
		}
		
		System.out.println("The title of the longest book is : "+bookName);
		
	}

}
