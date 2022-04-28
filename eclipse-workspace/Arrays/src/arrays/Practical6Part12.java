/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class Practical6Part12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double[] temperatures = { 3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1 };
		double total = 0;
		double average;

		for (int loop = 0; loop < temperatures.length; loop++) {
			total += temperatures[loop];
		}

		average = total / temperatures.length;
		System.out.println("The average is : " + average);

		double max = 0;

		for (int loop2 = 0; loop2 < temperatures.length; loop2++) {
			if (temperatures[loop2] > max) {
				max = temperatures[loop2];
			}
		}

		System.out.println("The maximum is : " + max);

		double min = max;
		
		for (int loop3 = 0; loop3 < temperatures.length; loop3++) {
			if (temperatures[loop3] < min) {
				min = temperatures[loop3];
			}
		}
		
		System.out.println("The minimum is : "+min);

	}

}
