/**
 * 
 */
package exceptional;

/**
 * @author damienmcgloin
 *
 */
public class ClassExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int loop = 0; loop<10000000; loop++) {
			
			if (loop==9999999) {
				System.out.println("Abort");
				break;	
			}
			System.out.println("Looper "+loop);
		}
		System.out.println("It's over !!!");

	}

}
