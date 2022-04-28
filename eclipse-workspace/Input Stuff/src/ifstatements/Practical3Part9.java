package ifstatements;
/**
 * 
 */

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical3Part9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int userAge;
		String userName;
		
		System.out.println("Please enter your age...");
		userAge = scanner.nextInt();
		
		if (userAge<=17 && userAge>0) {
			System.out.println("too young to continue");
		} else if (userAge>17) {
			System.out.println("Please enter your name...");
			userName = scanner.next();
			System.out.println("Name : "+userName+", Age : "+userAge);
		} else {
			System.out.println("sorry don't recognize your input");
		}
		scanner.close();

	}

}
