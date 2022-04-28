/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class Practical4Part1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int sum = 0;
		int num = 1;
		
		while (num<11) {
			num++;
			sum++;
			int total = num+sum;
			System.out.println(num+": The sum is "+total);
		}

	}

}
