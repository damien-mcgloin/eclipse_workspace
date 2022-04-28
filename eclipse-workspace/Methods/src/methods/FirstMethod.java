/**
 * 
 */
package methods;

/**
 * @author damienmcgloin
 *
 */
public class FirstMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Start of main");
		invokeMe();
		invokeName();
		System.out.println("End of main");
	
	} // end of main
	
	/**
	 * this is the first method - will output a message to screen
	 */
	
	public static void invokeMe() {
		// method body
		System.out.println("Ouch ! That hurt !");
	} // end of invokeMe method
	
	public static void invokeName() {
		int loop = 1;
		String name = "Damien McGloin";
		while (loop<=10) {
			System.out.println(name);
			loop++;
		}
	} // end of invokeName method
} // end of class

