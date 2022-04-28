package ifstatements;
/**
 * 
 */

/**
 * @author damienmcgloin
 *
 */
import java.util.Scanner;

public class Practical3Part2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int mark;
		
		System.out.println("Enter mark...");
		mark = scanner.nextInt();
		
		if (mark>=70 && mark<=100) {
			System.out.println("Classification : distinction");
		} else if (mark>=60 && mark<=69) {
			System.out.println("Classification : merit");		
		} else if (mark>=50 && mark<=59) {
			System.out.println("Classification : pass");
		} else if (mark>=0 && mark<=49) {
			System.out.println("Classification : fail");
		} else {
			System.out.println("Error: Unknown number entered");
		}
		scanner.close();

	}

}
