/**
 * 
 */
package methods;

/**
 * @author damienmcgloin
 *
 */

import java.util.Random;

public class Practical5Part1Q {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// randomGenerator();
		numStars(51);

	} // end of main method

	public static void randomGenerator() {

		Random random = new Random();

		System.out.println("Generating 10 random integers in range 1..100");

		for (int loop = 1; loop <= 10; loop++) {
			int randomNum = random.nextInt(100) + 1;
			System.out.println("Generated : " + randomNum);
		}

	} // end of randomGenerator method

	public static void numStars(int userInput) {

		if (userInput < 5 || userInput > 50) {
			System.out.println("Unknown value entered");
		} else {
			for (int outer = userInput; outer >= 0; outer--) {
				System.out.print(outer + " ");
				for (int inner = 1; inner <= outer; inner++) {
					System.out.print('*');
				}
				System.out.println();
			}
		}

	}

} // end of class
