/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class ForLoopExercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// prompt a user for input
		System.out.println("Please enter a number...");
		
		int userInput = scanner.nextInt();
		int total = userInput;
		
		// use a for loop to subtract 1 and then multiply second number by userInput
		for (int loop = userInput-1; loop>=1; loop--) {
			total *= loop;
			System.out.println(loop);
		}
		
		System.out.println(total);
		
		scanner.close();

	}

}
