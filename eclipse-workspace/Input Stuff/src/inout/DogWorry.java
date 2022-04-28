/**
 * 
 */
package inout;

/**
 * @author damienmcgloin
 *
 */
import java.util.Scanner;

public class DogWorry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String isDogAwake;
		// get the scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Is the dog awake ? Enter yes or no");
		
		// get the user response
		isDogAwake = scanner.nextLine();
		
		// make a decision IF
		if (isDogAwake.equalsIgnoreCase("yes")) {
			System.out.println("PANIC !");
		}
		if (isDogAwake.equalsIgnoreCase("no")) {
			System.out.println("Continue to teach !");
		}
		System.out.println("Bye");
		scanner.close();

	}

}
