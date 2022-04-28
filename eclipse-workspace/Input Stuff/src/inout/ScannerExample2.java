/**
 * 
 */
package inout;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class ScannerExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// vars
		int userAge;
		userAge = 0;
		
		// set up a scanner
		Scanner scanner = new Scanner(System.in);
		
		// get the input from the user
		System.out.println("Input your age...");
		userAge = scanner.nextInt();
		
		// if statement to check if the users are 18 or under
		if (userAge >= 18) {
			System.out.println("You can vote !");
		}
		if (userAge < 18) {
			System.out.println("You can't vote");
		}
		scanner.close();
	}

}
