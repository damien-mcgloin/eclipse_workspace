package enums;

import java.util.ArrayList;

public class LibrarySystem {

	public static void main(String[] args) {
		
		Book b1 = new Book("Catch 22", Genre.COMEDY);
		Book b2 = new Book("Mockingbird", Genre.THRILLER);
		Book b3 = new Book("Peter Kay", Genre.COMEDY);
		
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		for(Book book: books) {
			if (book.getGenre() == Genre.COMEDY) {
				System.out.println("Found a comedy "+book.getName());
			}
		}

	}

}
