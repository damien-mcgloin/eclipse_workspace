/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class WhileEvenNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// outputs all even numbers between 1 and 20
		int countEven = 1;
		while ((countEven <= 20) ) {
			// about to check if this is an even number
			if (countEven %2==0) {
				// even number - output to screen
				System.out.println("CountEven is: " + countEven);
			}
			countEven++;
		}

	}

}
