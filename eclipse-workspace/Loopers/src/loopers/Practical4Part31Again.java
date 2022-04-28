/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical4Part31Again {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String userName;

		// prompt user for their name
		System.out.println("Enter your name!");
		userName = scanner.nextLine();

		for (int loop = 1; loop < 10; loop++) {
			System.out.println(userName);
		}
		scanner.close();

	}

}
