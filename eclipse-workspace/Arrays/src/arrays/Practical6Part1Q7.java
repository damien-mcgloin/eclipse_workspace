/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class Practical6Part1Q7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		shoeCollection();
		
	} // end of main method
	
	public static void shoeCollection() {
		
		int[] shoeSizes = { 12, 8, 10, 11, 9, 10 };
		
		for (int loop = 0; loop<shoeSizes.length; loop++) {
			System.out.println(shoeSizes[loop]);
		}
		
	} // end of shoeCollection method

} // end of class
