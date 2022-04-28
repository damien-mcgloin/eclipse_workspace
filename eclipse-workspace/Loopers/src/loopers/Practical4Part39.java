/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class Practical4Part39 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int leapYear = 1910; leapYear<=1990; leapYear++) {
			if (leapYear%4 == 0) {
				System.out.println(leapYear);
			}
		}

	}

}
