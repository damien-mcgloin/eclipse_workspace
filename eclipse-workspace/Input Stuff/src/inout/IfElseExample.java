/**
 * 
 */
package inout;

/**
 * This is an example of how to use if else statements
 * @author damienmcgloin
 *
 */
public class IfElseExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare the vars
		int age;
		boolean goodCreditHistory;
		
		// Assign a value to the vars
		age = 19;
		goodCreditHistory = false;
		
		// Print if else statement
		if ((age >= 18) && (goodCreditHistory == true)) {
			System.out.println("Your application has been approved !");
		} else {
			System.out.println("You application has been denied :(");
		}

	}

}
