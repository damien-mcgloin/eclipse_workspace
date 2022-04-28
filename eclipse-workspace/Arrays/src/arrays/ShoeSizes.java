/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class ShoeSizes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] shoes = { 3, 5, 10, 7 };
		displayArray(shoes);
		updateArray(shoes);
		
	} // end of main method
	
	/**
	 * Display contents
	 * @param shoes
	 */
	public static void displayArray(int[] shoes) {
		// show all the values
				for (int loop=0; loop<shoes.length;loop++) {
					System.out.println(shoes[loop]);
				}
		
	} // end of 2nd method
	
	public static void updateArray(int[] myArrayToUpdate) {
		
		for (int loop=0; loop<myArrayToUpdate.length; loop++) {
			myArrayToUpdate[loop]++;
		}
		
	}

}
