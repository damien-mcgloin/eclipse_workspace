/**
 * 
 */
package exceptional;

/**
 * @author damienmcgloin
 *
 */
public class ClassExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			int[] myArray = { 1, 2, 3, 4 };
			
			for (int loop = 0; loop < 6; loop++) {
				System.out.println(myArray[loop]);
			}
		} catch (Exception exception) {
			System.out.println("Sorry had a problem");
			exception.printStackTrace();
		}

	}

}
