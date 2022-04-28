/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class BreakerExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int loop;
		loop = 10;

		do {
			if (loop == 3) {
				System.out.println("Abort!");
				break;
			}
			System.out.println(loop);
			loop--;
		} while (loop > 0);

	}

}
