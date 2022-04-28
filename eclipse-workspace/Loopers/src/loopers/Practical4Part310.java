/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical4Part310 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int userAge;
		
		do {
		// prompt the user for their age
		System.out.println("Please enter your age...");
		userAge = scanner.nextInt();
		
		if (userAge>=1 && userAge<=30) {//start of if statement
			System.out.println("You are young");
		} else if (userAge>=31 && userAge<=60) {
			System.out.println("You are getting on!");
		} else if (userAge>=61 && userAge<=120) {
			System.out.println("You look amazing for your age!");
		} else {
			System.out.println("Error: Unknown value entered");
		} // end of if statement
		}// end of do statement
		
		while (userAge<1 || userAge>120);
		scanner.close();
		}// end of main method
		
		
	} // end of class

 
