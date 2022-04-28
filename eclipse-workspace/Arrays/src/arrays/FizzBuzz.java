/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for(int loop = 1; loop<=100; loop++) {
			if(loop%3==0) {
				System.out.println("Fizz");
			} else if (loop%5==0) {
				System.out.println("Buzz");
			} else {
				System.out.println(loop);
			}
		}

	}

}
