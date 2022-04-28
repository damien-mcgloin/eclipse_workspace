/**
 * 
 */
package methods;

/**
 * @author damienmcgloin
 *
 */
public class ThursdayMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("in main");
		invokeName(5, "Damien");
		countdown(10, 5);
		System.out.println("end main");

	} // end of main
	
	/**
	 * @param count affects number of times statement is printed
	 * @param name affects what is printed to console
	 */
	public static void invokeName(int count, String name) {
		
		for (int loop = 1; loop<=count; loop++) {
		System.out.println(name);
		}
		
	} // end of 2nd class
	
	public static void countdown (int count, int range) {
		
		for (int loop = count; loop>=range; loop--) {
			System.out.println(loop);
		}
		
	} // end of 3rd class

} // end of class
