/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class MoreWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// even numbers only 1... 50
		int counter = -10;

		// 1.. 99
		while (counter <= 50) {
			if (counter % 2 == 0) {
				// even number
				System.out.println(counter);
			} // end of IF
			counter++;
		} // end of while

	}

}
