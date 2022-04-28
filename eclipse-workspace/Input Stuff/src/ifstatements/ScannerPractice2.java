/**
 * 
 */
package ifstatements;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class ScannerPractice2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double side = 0;
		
		System.out.println("Please input the length in cms...");
		
		side = scanner.nextDouble();
		
		System.out.printf("The perimeter is : %s",side*4,"cm\n");
		System.out.printf("\nThe area is: %s",Math.pow(side, 2));
		
		scanner.close();

	}

}
