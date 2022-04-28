package ifstatements;

/**
 * 
 */

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical3Part5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int userScore;

		System.out.println("Enter mark ...");
		userScore = scanner.nextInt();

		if (userScore >100 || userScore <0) {
			System.out.println("Error : Unknown value");
		} else if (userScore >= 50 && userScore <= 59) {
			System.out.println("Classification : Pass");
		} else if (userScore >= 60 && userScore <= 69) {
			System.out.println("Classification : Merit");
		} else if (userScore >= 70 && userScore <= 100) {
			System.out.println("Classification : Distinction");
		} else if (userScore >= 0 && userScore <= 49) {
			System.out.println("Classification : fail");
		} else {
			System.out.println("I don't know dawg");
		}
		scanner.close();

	}

}
