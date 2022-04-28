/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical4Part10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// set up the scanner
		Scanner scanner = new Scanner(System.in);
		int userAge;

		do {

			// prompt user for age
			System.out.println("Please input your age...");
			userAge = scanner.nextInt();

			if (userAge > 0 && userAge < 31) {
				System.out.println("You are young");
			} else if (userAge > 30 && userAge < 61) {
				System.out.println("You are getting on!");
			} else if (userAge > 60 && userAge < 121) {
				System.out.println("You look amazing for your age!");
			} else {
				System.out.println("Error: Please enter again");
			}

		} while (userAge < 1 || userAge > 120);
		scanner.close();

	}

}
