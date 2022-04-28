/**
 * 
 */
package ifstatements;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class ScannerPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int userAge = 18;
		
		System.out.printf("please input your age\n");
		
		userAge = scanner.nextInt();
		
		if (userAge>=18) {
			System.out.println("You can vote !");
		} else {
			System.out.println("You can't vote !");
		}
		scanner.close();

	}

}
