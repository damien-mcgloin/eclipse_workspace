/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class Practical4Part35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int even = 1; even<100; even++) {
			if (even%2 == 0) {
				System.out.println(even);
			}
		}
		
		for (int odd = 10; odd<=40; odd++) {
			if (odd%2 == 1) {
				System.out.println(odd);
			}
		}

	}

}
