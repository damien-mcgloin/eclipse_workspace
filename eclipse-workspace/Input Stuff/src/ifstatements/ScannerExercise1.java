/**
 * 
 */
package ifstatements;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class ScannerExercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int userAge;
		
		System.out.println("Please input your age...");
		
		userAge = scanner.nextInt();
		
		
		if (userAge >= 18) {
			System.out.println("You can vote !");
		} else {
			System.out.println("You can't vote :(");
		}
		scanner.close();

	}

}
