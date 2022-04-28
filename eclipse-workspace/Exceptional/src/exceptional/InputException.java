/**
 * 
 */
package exceptional;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class InputException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int age = 0;
		Scanner scanner = new Scanner(System.in);
		boolean OK = false;

		do {
			try {
				System.out.print("Please enter your age : ");
				age = scanner.nextInt();
				System.out.printf("%d That is quite old !", age);
				OK = true;
				scanner.close();

			} catch (Exception exception) {
				System.out.println("my bad!");
				OK = false;
				scanner.next();
			}
		} while (!OK);
		System.out.println("try again");
		OK = false;

	}

}
