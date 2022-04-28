/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class NameEncoder2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// prompt user for name
		System.out.println("Enter your name...");
		
		String userName = scanner.nextLine();
		
		// set up for loop. compare name length with new var
		for (int loop = 0; loop<userName.length(); loop++) {
			// check if the character is an '*' or ' '
			if (userName.charAt(loop) != ' ') {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			scanner.close();
		}

	}

}
