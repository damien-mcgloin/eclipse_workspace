package challenge;

import java.util.ArrayList;

public class LibrarySearch {

	public static ArrayList<Book> searchByISBN(ArrayList<Book> allBooks, String ISBN) {
		ArrayList<Book> results = new ArrayList<Book>();

		for (Book book : allBooks) {
			if (book.getISBN().equals(ISBN)) {
				results.add(book);
			}
		}

		return results;

	}

	public static ArrayList<Book> searchByAuthor(ArrayList<Book> allBooks, String author) {
		ArrayList<Book> results = new ArrayList<Book>();

		for (Book book : allBooks) {
			if (book.getAuthor().equals(author)) {
				results.add(book);
			}
		}
		return results;
	}

	public static ArrayList<Book> searchByTitle(ArrayList<Book> allBooks, String title) {
		ArrayList<Book> results = new ArrayList<Book>();

		for (Book book : allBooks) {
			if (book.getTitle().equals(title)) {
				results.add(book);
			}
		}
		return results;
	}

	public static ArrayList<Book> searchByRating(ArrayList<Book> allBooks, int rating) {
		ArrayList<Book> results = new ArrayList<Book>();

		for (Book book : allBooks) {
			if (book.getRating() == rating) {
				results.add(book);
			}
		}
		return results;
	}
}
