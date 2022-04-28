/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class WhileBlastOff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// counts down from 10 to 1 then exits and then
		// next statement is executed
		int countDown = 10;
		while (countDown!=0) {
			
			System.out.println(countDown);
			countDown--;
		}
		System.out.println("Blast Off!");
	}

}
