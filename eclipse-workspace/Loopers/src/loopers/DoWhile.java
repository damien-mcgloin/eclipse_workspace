/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class DoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		int loop = 1;
//		
//		do {
//			// going to happen at least once
//			System.out.println(loop);
//			loop++;
//		} while (loop<11);
		
		
		// use a do while loop to count down from 50 to 25 inclusive
		
		int looper = 50;
		
		do {
			System.out.println(looper);
			looper--;
		} while (looper>=25);
		
		

	}

}
