/**
 * 
 */
package ifstatements;

/**
 * @author damienmcgloin
 *
 */
import java.util.Scanner;

public class IfElseExercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int month;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the month e.g 1, 2, 3 etc.");
		month = scanner.nextInt();
		
		if (month>=9 && month<=12 || month==1) {
			System.out.println("This is semester 1");
		} else if (month>=2 && month<=5) {
			System.out.println("This is semester 2");
		} else if (month>=6 && month<=8) {
			System.out.println("This is the summer");
		} else { 
			System.out.println("Error: Insert month from 1-12");
		}
		scanner.close();

	}

}
