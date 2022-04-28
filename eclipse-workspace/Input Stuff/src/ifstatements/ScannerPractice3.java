/**
 * 
 */
package ifstatements;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class ScannerPractice3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double num1;
		
		System.out.println("Please input a number...");
		num1 = scanner.nextDouble();
		
		System.out.printf("The square root is: %s",Math.sqrt(num1));
		scanner.close();
		

	}

}
