/**
 * 
 */
package lecture;

/**
 * @author damienmcgloin
 *
 */
import java.util.Scanner;

public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// vars
		int age = 0;
		
		// set up scanner..
		Scanner scanner = new Scanner(System.in);
				
		// get the input from the user
		System.out.println("Please input your age...");
		age = scanner.nextInt();
		
		if (age >= 18) {
			System.out.println("You can vote");
		} else {
			System.out.println("You can't vote");
		}
		scanner.close();
	}

}
