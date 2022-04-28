package ifstatements;

/**
 * 
 */

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical3Part7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double userNumber;

		System.out.println("Please enter a decimal point in the format xx.xxxx eg 12.3456");
		userNumber = scanner.nextDouble();
		System.out.printf("Number rounded (two decimal places)    :  %.2f\n", userNumber);
		System.out.printf("Number squared (three decimal places)  :  %.3f\n", Math.pow(userNumber, 2));
		System.out.printf("Number cubed to (three decimal places) :  %.3f\n", Math.pow(userNumber, 3));
		System.out.printf("Square root (four decimal places)      :  %.4f", Math.sqrt(userNumber));

		scanner.close();
	}

}
