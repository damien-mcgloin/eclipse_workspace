/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class DoWhileExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int loop;
		loop = 10;
		
		do {
			// loop body goes here
			System.out.println(loop);
			loop--;
		} while (loop>=1);
		System.out.println("Finished!");

	}

}
