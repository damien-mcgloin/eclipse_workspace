package week3;

/**
 * 
 */

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;
import java.util.Random;

public class Magic8Ball2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Create an application that will prompt the user to ask a question... the
		 * application will then output (randomly) one of the following responses.
		 * 
		 * As I see it, yes. 
		 * Ask again later. 
		 * Better not tell you now. 
		 * Cannot predict now. 
		 * Concentrate and ask again. 
		 * Don't count on it. 
		 * It is certain. 
		 * It is decidedly so.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a question.. the 8 ball knows all..");

		Random random = new Random();

		String question;
		int number;

		question = scanner.nextLine();
		number = random.nextInt(7);

		System.out.println("You asked.. " + question);
		
		switch (number) {
		case 0:
			System.out.println("As I see it, yes.");
			break;
		case 1:
			System.out.println("As I see it, yes.");
			break;
		case 2:
			System.out.println("As I see it, yes.");
			break;
		case 3:
			System.out.println("As I see it, yes.");
			break;
		case 4:
			System.out.println("As I see it, yes.");
			break;
		case 5:
			System.out.println("As I see it, yes.");
			break;
		case 6:
			System.out.println("As I see it, yes.");
			break;
		case 7:
			System.out.println("As I see it, yes.");
			break;
		default:
			System.out.println("Error: Unknown Value");
		}
		scanner.close();

	}

}
