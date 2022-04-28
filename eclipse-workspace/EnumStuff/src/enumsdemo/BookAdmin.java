/**
 * 
 */
package enumsdemo;

import java.util.ArrayList;

/**
 * @author damienmcgloin
 *
 */
public class BookAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Book b1 = new Book(null, Genre.COMEDY);
		Book b2 = new Book("The catcher in the rye", Genre.THRILLER);
		Book b3 = new Book("Peter Kay", Genre.COMEDY);
		
		ArrayList<Book> books = new ArrayList<Book>();
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		ArrayList<Book> comedyBooks = searchForGenre(books, Genre.COMEDY);
		
		searchForGenre(books, Genre.THRILLER);
		
		if (comedyBooks.isEmpty()) {
			System.out.println("No searches...");
		} else {
			for (Book book : comedyBooks) {
				System.out.println(book.getName());
			}
		}

	}
	
	/**
	 * 
	 * @param books
	 * @param genre
	 */
	public static ArrayList<Book> searchForGenre(ArrayList<Book> books, Genre genre) {
		
		ArrayList<Book> searchMatches = new ArrayList<Book>();
		
		for (Book book : books) {
			if (book.getGenre()==(genre)) {
				System.out.println(genre+" "+book.getName());
				searchMatches.add(book);
			}
		}
		
		return searchMatches;
		
	}
	
	public static void displayAll(ArrayList<Book> books, Genre genre) {
		
		for(Book book : books) {
			if(book.getName()!=null) {
			System.out.println(book.getName());
			} else {
				System.out.println("Error: no books found");
			}
		}
		
	}
	
}
