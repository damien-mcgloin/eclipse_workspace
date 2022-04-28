/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class PracticalPart37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int num = 1000; num>=0; num--) {
			if (num==333) {
				System.out.println("Launch aborted!");
				break;
			}
			System.out.println(num);
		}

	}

}
