/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class MenuTime3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int userInput;

		// create a loop to cycle options for user
		do {
			// print menu for view
			System.out.println("1. File");
			System.out.println("2. Edit");
			System.out.println("3. Save");
			System.out.println("4. Delete");
			System.out.println("5. Exit");

			// prompt user for entry
			System.out.println("Please enter a number 1,2,3 etc.");
			userInput = scanner.nextInt();
			// set a conditional for user entry
			switch (userInput) {
			case 1:
				System.out.println("1.File\n");
				break;
			case 2:
				System.out.println("2.Edit\n");
				break;
			case 3:
				System.out.println("3.Save\n");
				break;
			case 4:
				System.out.println("4.Delete\n");
				break;
			case 5:
				System.out.println("5.Exit");
				break;
			default:
				System.out.println("Unknown value entered");
			}
		} while (userInput != 5);
		scanner.close();
	}

}
