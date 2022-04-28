/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class MenuTime2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int userInput;

		do {
			// print options for user
			System.out.println("1. Menu");
			System.out.println("2. Edit");
			System.out.println("3. Save");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			// prompt user for input
			System.out.println("Choose an option e.g 1, 2, 3 etc.");
			userInput = scanner.nextInt();

			switch (userInput) {
			case 1:
				System.out.println("1. Menu\n");
				break;
			case 2:
				System.out.println("2. Edit\n");
				break;
			case 3:
				System.out.println("3. Save\n");
				break;
			case 4:
				System.out.println("4. Delete\n");
				break;
			case 5:
				System.out.println("5. Exit");
				break;
			default:
				System.out.println("Unknown value entered\n");
			}
		} while (userInput != 5);
		scanner.close();

	}

}
