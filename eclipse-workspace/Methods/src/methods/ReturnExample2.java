/**
 * 
 */
package methods;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class ReturnExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String userName;
		userName = getUserName();
		
		if (userName.length() == 0) {
			System.out.println("What... no name?!?!?");
		} else {
			System.out.println("Hello "+userName);
		}

	} // end of main method
	
	public static String getUserName() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String userName = scanner.nextLine();
		
		scanner.close();
		
		return userName;
		
	} // end of name class

} // end of class
