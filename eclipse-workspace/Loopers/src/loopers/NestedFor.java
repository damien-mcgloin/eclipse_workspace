/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class NestedFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int exerciseCounter;
		exerciseCounter = 0;
		
		while (exerciseCounter < 10) {
			exerciseCounter++;
			if (exerciseCounter == 3 || exerciseCounter == 4) {
				System.out.println("Miss a few");
				continue;
				
			}
			
			System.out.println("Yes "+exerciseCounter);
		}
	}

}
