/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class NameEncoder5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// set up the scanner
		Scanner scanner = new Scanner(System.in);

		// prompt user for name
		System.out.println("Please enter your name...");
		String userName = scanner.nextLine();

		for (int loop = 0; loop < userName.length(); loop++) {
			if (userName.charAt(loop) != ' ') {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			scanner.close();
		}

	}

}
