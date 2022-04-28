/**
 * 
 */
package inout;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class ScannerExample7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare the vars and assign a value
		int userAge;
		userAge = 0;
		
		// set up the scanner
		Scanner scanner = new Scanner(System.in);
		
		// ask user to input age
		System.out.println("Please input your age...");
		userAge = scanner.nextInt();
		
		// check user's ability to vote
		if (userAge >= 18) {
			System.out.println("You can vote !");
		}
		if (userAge < 18) {
			System.out.println("You can't vote ya dingus !");
		}
		scanner.close();
	}

}
