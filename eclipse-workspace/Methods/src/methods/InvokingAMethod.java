/**
 * 
 */
package methods;

/**
 * @author damienmcgloin
 *
 */

public class InvokingAMethod {

	/**
	 * start point for this program... this is our first method based class
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		System.out.println("In main start");
		invokeMe();
		invokeName(5, "Damien");
		System.out.println("In main at end");

	} // end of main

	/**
	 * This method prints a message to screen
	 */
	public static void invokeMe() {
		System.out.println("You invoked me !");
	} // end of method

	/**
	 * This method prints my name to screen
	 * @param count - the number of times this is printed
	 * @param name - The name to be printed
	 */
	public static void invokeName(int count, String name) {
		for (int loop = 1; loop <= count; loop++) {
			System.out.println(name);
		}
	} // end of 2nd method

	public static void oddOrEven (int number) {
       
        if (number % 2 == 0) {
            System.out.println("Even");
        } else if (number % 2 !=0) {
            System.out.println("Odd");
        } else {
        	System.out.println("Unknown value");
        }
	} // end of 3rd method
	
}
// end of class
