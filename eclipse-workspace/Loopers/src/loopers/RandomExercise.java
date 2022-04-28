/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

import java.util.Random;

public class RandomExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// generates number between 1 and 10
		// and user must guess until correct

		Scanner scanner = new Scanner(System.in);
		Random random = new Random ();
		
		int randomNumber, userGuess;
		
		// default value
		userGuess = -1;

		// get the random number
		randomNumber = random.nextInt(10);
		randomNumber++; // how come this? // start with 0-9 so this makes it 1-10!
		
		while (randomNumber != userGuess) {
			// get user input
		System.out.println("Enter your guess (1-10) ?");
		userGuess = scanner.nextInt();
	}
		
	System.out.println("Well done.. you got it !");
	scanner.close();
	
	}
	

}
