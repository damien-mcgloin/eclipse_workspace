/**
 * 
 */
package inout;

/**
 * import scanner here !
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class ScannerExample5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declare the var
		int userAge;
		userAge = 0;
		
		// set up scanner
		Scanner scanner = new Scanner(System.in);
		
		// users can input age
		System.out.println("Input your age...");
		userAge = scanner.nextInt();
		
		// check whether users are under 18, 18 or older
		if (userAge >= 18) {
			System.out.println("You can vote !");
		}
		if (userAge < 18) {
			System.out.println("You can't vote");
		}
		scanner.close();
		
	}

}
