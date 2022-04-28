/**
 * 
 */
package loopers;

import java.util.Scanner;

/**
 * @author damienmcgloin
 *
 */
public class Encoder2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String name;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your name...");
		name = scanner.nextLine();

		for (int loop = 0; loop < name.length(); loop++)
			if (name.charAt(loop) != ' ') {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		scanner.close();
	}

}
