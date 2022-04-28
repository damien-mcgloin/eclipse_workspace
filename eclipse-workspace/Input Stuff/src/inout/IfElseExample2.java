/**
 * 
 */
package inout;

/**
 * @author damienmcgloin
 *
 */
public class IfElseExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare the var
		int month;
		
		// assign a value to the var
		month = 12;
		
		// input if else statement
		if ((month == 1) || (month >= 9) || (month == 10) && (month <= 11)) {
			System.out.println("This month is in semester 1");
		} else if ((month >= 2) && (month <= 5)) {
			System.out.println("This month is in semester 2");
		} else {
			System.out.println("Summer");
		}
	}

}
