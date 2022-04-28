/**
 * 
 */
package wrap;

/**
 * @author damienmcgloin
 *
 */
public class Wrappers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int pInt = 999;
		System.out.println(pInt);
		
		// creation of Integer wrapper class
		Integer wrapperInt = new Integer(999);
		System.out.println(wrapperInt);
		
		// constructor for the Integer - take a string
		Integer int1 = new Integer("999");
		System.out.println(int1);
		
		try {
		Integer int2 = new Integer("ten");
		System.out.println(int2);
		} catch (NumberFormatException numberFormatException) {
			System.out.println("ooops! - that's not a numeric value");
		} catch (Exception exception) {
			System.out.println("ooops! - something went wrong");
		}
		
		int myInt = Integer.parseInt("66");
		System.out.println(myInt);
		
		int anotherInt = int1.intValue();
		System.out.println(anotherInt);

	}

}
