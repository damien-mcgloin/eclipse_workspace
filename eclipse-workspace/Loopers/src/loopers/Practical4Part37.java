/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class Practical4Part37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int countDown = 1000; countDown>=0; countDown--) {
			if (countDown == 333) {
				break;
			}
			System.out.println(countDown);
		}
		System.out.println("Launch aborted!");

	}

}
