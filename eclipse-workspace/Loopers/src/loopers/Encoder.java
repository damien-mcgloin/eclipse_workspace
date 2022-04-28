/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Encoder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	/* 
	 * prompt user for full name. Then using a for loop
	 * replace each character with an asterisk. ignore spaces
	 */
	
	// variable declaration
	String name;

	// set up scanner
	Scanner scanner = new Scanner(System.in);
	
	// get user's name
	System.out.println("Enter your name : ");
	name = scanner.nextLine();
	
	// for loop to iterate through each char in the string
	for (int loop = 0; loop < name.length(); loop++) {
		// check if a space char
		if (name.charAt(loop) != ' ') {
			// not a space so replace with a '*'
			System.out.print("*");
		} else {
			// otherwise output a space
		}
		System.out.print(" ");
	}
	scanner.close();
			
		
		
			
		
		
	}

}	

	


