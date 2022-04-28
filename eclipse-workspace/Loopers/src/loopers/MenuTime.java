/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class MenuTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// vars
		int userInput;
		Scanner scanner = new Scanner(System.in);

		do {

			// show a menu on screen

			System.out.println("Menu....");
			System.out.println("1. File");
			System.out.println("2. Edit");
			System.out.println("3. Delete");
			System.out.println("4. Save");
			System.out.println("5. Quit");

			// prompt a user for option

			System.out.println("Enter option...");

			// get the user's option
			userInput = scanner.nextInt();

			// process the option
			switch (userInput) {
			case 1:
				System.out.println("Filing...");
				break;
			case 2:
				System.out.println("Editing...");
				break;
			case 3:
				System.out.println("Deleting...");
				break;
			case 4:
				System.out.println("Saving...");
				break;
			case 5:
				System.out.println("Quit...");
				break;
			default:
				System.out.println("Unknown value entered: Try again");
			}
		
			// repeat the menu options depending on user choice
		} while (userInput != 5);
		
		scanner.close();

		// program end
		System.out.println("Bye, thanks for using the system");

	}

}
