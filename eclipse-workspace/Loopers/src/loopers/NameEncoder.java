/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class NameEncoder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String name; // set up a scanner
		Scanner scanner = new Scanner(System.in);
		
		// get a user's name
		System.out.println("Enter your name : ");
		name = scanner.nextLine();
		
		// for loop to iterate through each char in ythe string
		for (int loop = 0; loop < name.length(); loop++) {
			if (name.charAt(loop) != ' ') {
				// not a space so replace with a '*;
				System.out.print("*");
			} else {
				// output a space
				System.out.print(" ");
			}
		} // clean up resources
		scanner.close();

	}

}
