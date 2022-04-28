/**
 * 
 */
package ifstatements;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class IfElseExercise3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input two numbers...");
		
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
		if (num1>num2) {
			System.out.println("The biggest number is "+num1);
		} else if (num2>num1) {
			System.out.println("The biggest number is "+num2);
		} else {
			System.out.println("The two numbers are the same");
		}
		scanner.close();

	}

}
