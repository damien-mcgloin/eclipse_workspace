/**
 * 
 */
package inout;

// imports go here !
import java.util.Scanner;

/**
 * fvwfev
 * @author damienmcgloin
 *
 */
public class KeyboardInputExample {

	/**
	 * wewer
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create the scanner for use..
		Scanner scanner = new Scanner(System.in);
		String name, city;
		
		System.out.println("What is your name ?");
		name = scanner.nextLine();
		System.out.println("Howdy " + name);
		
		System.out.println("Where do you live ?");
		city = scanner.nextLine();
				
		System.out.println("Yes " +city + " is a nice place !");
		scanner.close();
	}

}
