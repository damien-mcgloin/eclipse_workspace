/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class Practical4Part1Again {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declare int variables, sum and num and add values 0 and 1
		int sum = 0;
		int num = 1;

		// add sum and num then assign result to variable
		
		
		// print 'the sum is ' + the total
		//System.out.printf("the sum is "+total);
		
		while (num<=10) {
			sum+=num;
			++num;
			System.out.println(sum);
		}
	}

}
