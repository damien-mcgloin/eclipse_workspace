/**
 * 
 */
package inout;

/**
 * import scanner here!
 * @author damienmcgloin
 *
 */
import java.util.Scanner;

public class ScannerExample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declare the var
		int userAge;
		userAge = 0;
		
		// set up scanner
		Scanner scanner = new Scanner(System.in);
		
		// get input from user
		System.out.println("Input your age...");
		userAge = scanner.nextInt();
		
		// check if user is over or under 18
		if (userAge >= 18) {
			System.out.println("You can vote !");
		} 
		if (userAge < 18) {
			System.out.println("You can't vote ya wee bitch ya !");
		}
		scanner.close();
	}

}
