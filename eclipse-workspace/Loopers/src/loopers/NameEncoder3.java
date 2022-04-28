package loopers;
/**
 * 
 */

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class NameEncoder3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// set up scanner
		Scanner scanner = new Scanner(System.in);
		
		// prompt user to enter their name
		System.out.println("Enter your name...");
		String userName = scanner.nextLine();
		
		// start of for loop
		for (int loop = 0; loop<userName.length(); loop++) {
			// check if input is a space
			if (userName.charAt(loop) != ' ') {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			scanner.close();
		}

	}

}
