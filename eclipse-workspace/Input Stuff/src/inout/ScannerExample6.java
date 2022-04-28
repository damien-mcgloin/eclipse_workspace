/**
 * 
 */
package inout;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class ScannerExample6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// vars
		int userAge;
		userAge = 0;
		
		// set up the scanner
		Scanner scanner = new Scanner(System.in);
		
		// input user age
		System.out.println("Input your age...");
		userAge = scanner.nextInt();
		
		// enter and if statement checking age restriction
		if (userAge >= 18) {
			System.out.println("You can vote !");
		}
		if (userAge < 18) {
			System.out.println("You can't vote :(");
		}
		scanner.close();

	}

}
