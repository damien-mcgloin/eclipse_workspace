/**
 * 
 */
package inout;

// imports go here!
import java.util.Scanner;

/**
 * @author damienmcgloin
 *
 */
public class ScannerExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// vars
		int userAge;
		userAge = 0;
		
		// set up scanner
		Scanner scanner = new Scanner(System.in);
		
		// get the input from the user
		System.out.println("What age are you ?");
		userAge = scanner.nextInt();
		
		// if statement to deal with 18 or over
		if (userAge >= 18) {
			System.out.println("You are able to vote");
		}
		
		// if statement to deal with under 18
		if (userAge <18) {
			System.out.println("Sorry you can't vote");
		}
		scanner.close();
	}

}
