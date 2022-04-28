package ifstatements;
/**
 * 
 */

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class ScannerExercise3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double root = 0;
		
		System.out.println("Please input a number...");
		root = scanner.nextDouble();
		
		System.out.printf("Square root is %s",Math.sqrt(root));
		
		scanner.close();

	}

}
