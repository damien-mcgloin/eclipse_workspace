package ifstatements;

/**
 * 
 */

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class Practical3Part3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int userAge;
		String userName;
		System.out.println("Please enter your age...");
		userAge = scanner.nextInt();

		if (userAge <= 17) {
			System.out.println("too young to vote");
		} else {
			System.out.println("Please enter your name ");
			userName = scanner.next();
			System.out.println("Name : "+userName+", Age : "+userAge);
		}
		scanner.close();

	}

}
