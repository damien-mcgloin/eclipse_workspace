/**
 * 
 */
package inout;

/**
 * @author damienmcgloin
 *
 */
import java.util.Scanner;

public class ScannerExample3 {

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
		System.out.println("Input your age...");
		userAge = scanner.nextInt();
		
		// check if user is 18 or over
		if (userAge >= 18) {
			System.out.println("You can vote !");
		}
		if (userAge < 18) {
			System.out.println("You can't vote bitch!!");
		}
		scanner.close();
	}

}
