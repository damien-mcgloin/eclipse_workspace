/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical4Part2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int userInput;

		Scanner scanner = new Scanner(System.in);

		// output five options to screen
		System.out.println("1. File");
		System.out.println("2. Edit");
		System.out.println("3. Save");
		System.out.println("4. Delete");
		System.out.println("5. Exit");

		// output an option to the user
		do {
			System.out.println("Select option...");
			userInput = scanner.nextInt();
			
			switch (userInput) {
			case 1:
				System.out.println("1. File");
				break;
			case 2:
				System.out.println("2. Edit");
				break;
			case 3:
				System.out.println("3. Save");
				break;
			case 4:
				System.out.println("4. Delete");
				break;
			case 5:
				System.out.println("5. Exit");
				break;
			default:
				System.out.println("Unknown value entered");
			}
		} while (userInput != 5);
		System.out.println("Thank you, have a super awesome day!");
		scanner.close();
	}

}
