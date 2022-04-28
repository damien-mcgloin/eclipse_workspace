/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical4Part2Again {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int userInput;

		// start of loop

		do {
			// output menu to screen
			System.out.printf("1. File\n");
			System.out.printf("2. Edit\n");
			System.out.printf("3. Save\n");
			System.out.printf("4. Delete\n");
			System.out.printf("5. Exit\n\n");

			// prompt user for response
			System.out.printf("Please enter your choice e.g 1,2,3\n\n");
			userInput = scanner.nextInt();

			// switch statement to move between choices
			switch (userInput) {
			case 1:
				System.out.printf("File selected\n\n");
				break;
			case 2:
				System.out.printf("Edit selected\n\n");
				break;
			case 3:
				System.out.printf("Save selected\n\n");
				break;
			case 4:
				System.out.printf("Delete selected\n\n");
				break;
			case 5:
				System.out.printf("Exit selected\n\n");
				break;
			default:
				System.out.println("Unknown value entered\n\n");
			}
		} while (userInput != 5);
		scanner.close();

	}

}
