/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class NestedForLoop2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int outer = 1; outer <= 3; outer++) {
			for (int inner = 1; inner <= 5; inner++) {
				System.out.print(outer + " " + inner + "  ");
			} // end of inner
			System.out.println();
		} // end of outer

	}

}
