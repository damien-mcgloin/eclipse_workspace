/**
 * 
 */
package ifstatements;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class ScannerExercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double side = 0;
		
		System.out.println("Please input the length of one side...");
		
		side = scanner.nextDouble();
		System.out.printf("Perimeter :%.2f%s",side*4 ," cm\n");
		System.out.printf("Area :%.2f%s",Math.pow(side, 2)," cm2");
		
		scanner.close();
		
	}

}
