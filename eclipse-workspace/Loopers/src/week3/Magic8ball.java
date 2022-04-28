/**
 * 
 */
package week3;

/**
 * @author damienmcgloin
 *
 */
import java.util.Scanner;
import java.util.Random;

public class Magic8ball {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Create an application that will prompt the user to ask a question... the
		 * application will then output (randomly) one of the following responses.
		 * 
		 * As I see it, yes. Ask again later. Better not tell you now. Cannot predict
		 * now. Concentrate and ask again. Don't count on it. It is certain. It is
		 * decidedly so.
		 */

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Enter your question... the 8 ball knows all...");
		
		String userInput;
		userInput = scanner.nextLine();
		
		
		int randomNumber;
		randomNumber = random.nextInt(7);
		
		System.out.println("You asked... "+userInput);

		switch (randomNumber) {
		case 0:
			System.out.println("As I see it, yes.");
			break;
		case 1:
			System.out.println("Ask again later.");
			break;
		case 2:
			System.out.println("Better not tell you now.");
			break;
		case 3:
			System.out.println("Cannot predict now.");
			break;
		case 4:
			System.out.println("Concentrate and ask again.");
			break;
		case 5:
			System.out.println("Don't count on it.");
			break;
		case 6:
			System.out.println("It is certain.");
			break;
		case 7:
			System.out.println("It is decidedly so.");
			break;
		default:
			System.out.println("Unknown value entered");

		}
		scanner.close();

	}

}
