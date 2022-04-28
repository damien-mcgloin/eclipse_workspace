/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class PracticalPart2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int userInput;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1. File\n");
			System.out.println("2. Edit\n");
			System.out.println("3. Save\n");
			System.out.println("4. Delete\n");
			System.out.println("5. Exit\n");
			System.out.println("\tSelect Option ....\n");
			
			userInput = scanner.nextInt();

			if (userInput == 1) {
				System.out.println("File");
			} else if (userInput == 2) {
				System.out.println("Edit");
			} else if (userInput == 3) {
				System.out.println("Save");
			} else if (userInput == 4) {
				System.out.println("Delete");
			} else if (userInput == 5) {
				System.out.println("Exit");
			} else {
				System.out.println("Unknown value: Try again");
			}
		} while (userInput != 5);
		System.out.println("Program Quitting");
		
		scanner.close();
			
	}

}
