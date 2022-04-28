/**
 * 
 */
package methods;

/**
 * @author damienmcgloin
 *
 */

import java.util.Random;

public class Practical5Part1Another {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		oddOrEven(10);
		changeToLowerCase('h');
		checkMultiple(5, 25);
		printRandom(5);
		countDown(51);
		printNumberInWord(1);

	} // end of main method

	/**
	 * 
	 * @param userInput
	 */
	public static void oddOrEven(int userInput) {

		if (userInput % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	} // end of oddOrEven class

	public static void changeToLowerCase(char letter) {

		if (Character.isUpperCase(letter)) {
			System.out.println(Character.toLowerCase(letter));
		} else {
			System.out.println(letter);
		}

	} // end of changeToLowerCase

	public static void checkMultiple(int num1, int num2) {

		if (num2 % num1 == 0) {
			System.out.println("num2 is a multiple of num1");
		} else {
			System.out.println("num2 is not a multiple of num1");
		}

	} // end of checkMultiple class

	public static void printRandom(int num1) {

		System.out.println("Generating 10 random integers n range 1..100");
		int randomNum;
		Random random = new Random();

		for (int loop = 1; loop <= 10; loop++) {
			randomNum = random.nextInt(100) + 1;
			System.out.println("Generated : " + randomNum);
		}

	} // end of printRandom method

	public static void countDown(int userInput) {

		if (userInput < 5 || userInput > 50) {
			System.out.println("Unknown value entered");
		} else {
			for (int outer = userInput; outer >= 1; outer--) {
				System.out.print(outer + " ");
				for (int inner = 1; inner <= outer; inner++) {
					System.out.print('*');
				}
				System.out.println();
			}
			
		}

	} // end of printRandom method
	
	public static void printNumberInWord(int numWord) {
		
		switch (numWord) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 9:
				System.out.println("Nine");
				break;
			default:
				System.out.println("Other");
		}
		
	} // end of printNumberInWord method

} // end of class
