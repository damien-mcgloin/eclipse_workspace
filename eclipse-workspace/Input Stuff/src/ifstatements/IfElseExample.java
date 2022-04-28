/**
 * 
 */
package ifstatements;

/**
 * @author damienmcgloin
 *
 */
public class IfElseExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declare the vars
		int age;
		boolean goodCreditHistory;
		
		// set the vars
		age = 15;
		goodCreditHistory = true;
		
		/* using double equals is unnecessary with boolean!!!
		* check if user is 18+ and good credit history
		*/
		
		if (age>=18 && goodCreditHistory) {
			/* if both are true in here let the user
			* know their application is successful
			*/
			System.out.println("Your application has been successful !");
		} else {
			/*
			 * either or both conditions are false so in here to let
			 * the user know the application has been unsuccessful
			 */
			System.out.println("Try somewhere else loser !");
		} // end of IF ELSE

	} // end of main method

}
