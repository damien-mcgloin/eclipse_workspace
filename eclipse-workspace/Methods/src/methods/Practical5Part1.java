/**
 * 
 */
package methods;

/**
 * @author damienmcgloin
 *
 */

//import java.util.Scanner;
import java.util.Random;
import java.util.Calendar;

public class Practical5Part1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// oddOrEven(20191);
		// caseCheck('F');
		// isMultiple(5, 23);
		// randomNum(1);
		// countDown();
		printStars();
		// printNumberInWord(9);
		upperBoundAverage(100);
		morningOrAfternoon();

		/*int count = 10;

		for (int outer = count; outer > 0; outer--) {
			System.out.print(outer+" ");
			for (int inner = 1; inner <= outer; inner++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}*/

	} // end of main method

	public static int oddOrEven(int num) {

		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

		return num;

	} // end of oddOrEven method

	public static void caseCheck(char letter) {

		if (Character.isUpperCase(letter)) {
			System.out.println(Character.toLowerCase(letter));
		}

	} // end of caseCheck method

	public static void isMultiple(int num1, int num2) {

		if (num2 % num1 == 0) {
			System.out.println(num2 + " is a multiple of " + num1);
		} else {
			System.out.println(num2 + " is not a multiple of " + num1);
		}

	} // end of isMultiple method

	public static void randomNum(int num1) {

		Random random = new Random();

		System.out.println("Generating 10 random integers in range 1...100");

		for (int loop = 1; loop <= 10; loop++) {
			num1 = random.nextInt(100);
			if (num1 < 1) {
				num1++;
			}
			System.out.println("Generated " + num1);
		}

	} // end of randomNum method

	/**
	 * Prompt the user for a number (between 5 and 50 (inclusive)). Then output to
	 * screen a countdown of the numbers starting with the given number and include
	 * on the same line the same number of asterisks.
	 */
	public static void printStars() {

		// simulated input from user is 5 - if input was from a user then
		// validation should be included.
		int count = 5;

		// print the number
		for (int outerLoop = count; outerLoop > 0; outerLoop--) {
			System.out.print(outerLoop + " ");

			// print the required number of stars
			for (int innerLoop = 1; innerLoop <= outerLoop; innerLoop++) {
				System.out.print("*");
			}
			// create line break
			System.out.println();
		}
	} // end of print stars method

	public static void printNumberInWord(int num1) {

		// prompt user for a number
		System.out.println("enter a number");

		if (num1 == 1) {
			System.out.println("One");
		} else if (num1 == 2) {
			System.out.println("Two");
		} else if (num1 == 9) {
			System.out.println("Nine");
		} else {
			System.out.println("Other");
		}

	} // end of printNumberInWord method

	public static void upperBoundAverage(int upperLimit) {

		int total = 0;
		double average = 0;
		for (int loop = 1; loop <= upperLimit; loop++) {
			total+=loop;
		}
		System.out.println("Total is : "+total);
		average = (double) total / (double) upperLimit;
		System.out.printf("Average is %.2f", average);

	} // end of upperBoundAverage method
	
	public static void morningOrAfternoon() {
		
		Calendar now = Calendar.getInstance();
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
		
		if (hour <= 11) {
			System.out.println("\nRise and shine angelcakes!");
		} else {
			System.out.println("\nI hope your day went well and continues to do so");
		}
		
	}

} // end of class
