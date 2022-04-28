/**
 * 
 */
package ifstatements;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;
import java.util.Random;

public class EightBall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// vars needed
		int randomNumber;
		String userInput;
		
		// imported classes required - scanner for keyboard input
		// & random for random number
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		// prompt user question
		System.out.println("Enter a question...");
		userInput = scanner.nextLine();
		
		// get a random number from 0-7
		randomNumber = random.nextInt(8);
		
		// adding 1 to the randomNumber - why? random.nextInt
		// gives a number between 0-7
		randomNumber = randomNumber + 1;
		
		System.out.println(userInput);

		switch (randomNumber) {
		case 1:
			System.out.println("As I see it, yes");
			break;
		case 2:
			System.out.println("Ask again later.");
			break;
		case 3:
			System.out.println("Better not tell you now.");
			break;
		case 4:
			System.out.println("Cannot predict now");
			break;
		case 5:
			System.out.println("Concentrate and ask again");
			break;
		case 6:
			System.out.println("Don't count on it");
			break;
		case 7:
			System.out.println("It is certain");
			break;
		case 8:
			System.out.println("It is decidedly so");
			break;
		default:
			System.out.println("Unknown value entered");
		
		}
		scanner.close();
	}

}
