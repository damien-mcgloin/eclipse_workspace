/**
 * 
 */
package methods;

/**
 * @author damienmcgloin
 *
 */

import java.util.Random;

public class Practical5Part1AgainAgain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// oddOrEven(5);
		// convertCase('g');
		// checkMultiple(5, 25);
		// randomNumber();
		numStars(51);

	} // end of main method

	public static void oddOrEven(int userInput) {

		if (userInput % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	} // end of oddOrEven method

	public static void convertCase(char userLetter) {

		if (Character.isUpperCase(userLetter)) {
			System.out.println(Character.toLowerCase(userLetter));
		} else {
			System.out.println(userLetter);
		}

	} // end of convertCase method

	public static void checkMultiple(int num1, int num2) {

		if (num2 % num1 == 0) {
			System.out.println("num2 is a multiple of num1");
		} else {
			System.out.println("num2 is not a multiple of num1");
		}

	} // end of checkMultiple method

	public static void randomNumber() {

		Random random = new Random();

		System.out.println("Generating 10 random integers in range 1..100");

		for (int loop = 1; loop <= 10; loop++) {
			int randomNum = random.nextInt(100) + 1;
			System.out.println("Generated : " + randomNum);
		}
		System.out.println("Done");

	} // end of randomNumber method

	public static void numStars(int userInput) {

		if (userInput < 5 || userInput > 50) {
			System.out.println("Unknown value entered");
		} else {
			for (int outer = userInput; outer >= 0; outer--) { // start of outer for loop
				System.out.print(outer + " ");
				for (int inner = 1; inner <= outer; inner++) { // start of inner for loop
					System.out.print('*');
				} // end of inner for loop
				System.out.println();

			} 
		} 

	} // end of numStars method

} // end of class
