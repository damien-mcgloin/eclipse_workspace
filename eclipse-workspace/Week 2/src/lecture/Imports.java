/**
 * 
 */
package lecture;

/**
 * @author damienmcgloin
 *
 */
//imports here
import java.util.Scanner;

public class Imports {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String userName;
		
		// set up scanner..
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello, type your full name and press enter ...");
		userName = scanner.nextLine();
		
		System.out.println("Hello "+userName);
		scanner.close();
	}
	
}
