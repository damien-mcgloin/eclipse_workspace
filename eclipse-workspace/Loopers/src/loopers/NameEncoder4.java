/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class NameEncoder4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Set up scanner
		Scanner scanner = new Scanner(System.in);

		// prompt user to enter name
		System.out.println("Please enter your name...");
		String name = scanner.nextLine();

		for (int loop = 0; loop < name.length(); loop++) {
			if (name.charAt(loop) != ' ') {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		scanner.close();

	}

}
