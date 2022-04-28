package ifstatements;
/**
 * 
 */

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical2Part10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String userParty;
		
		System.out.println("Voting\nEnter 'con' for Conservative and 'lab' for Labour");
		userParty = scanner.next();
		
		if (userParty.equalsIgnoreCase("con")) {
			System.out.println("Vote registered for Conservative");
		} else if (userParty.equalsIgnoreCase("lab")) {
			System.out.println("Vote registered for Labour");
		} else {
			System.out.println("Sorry voting party unrecognized");
		}
		scanner.close();

	}

}
