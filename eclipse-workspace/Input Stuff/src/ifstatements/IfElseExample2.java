/**
 * 
 */
package ifstatements;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class IfElseExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int mark;
		char grade;
		
		System.out.println("Please input the score...");
		mark = scanner.nextInt();
		
		if (mark>=90) {
			grade = 'A';
		} else if (mark>=80) {
			grade = 'B';
		} else if (mark>=70) {
			grade = 'C';
		} else if (mark>=60) {
			grade = 'D';
		} else if (mark>=50) {
			grade = 'E';
		} else {
			grade = 'F';
		}
		// end of If Else statement
		
		System.out.println("You got a "+grade);

		scanner.close();
	} // end of main

}
