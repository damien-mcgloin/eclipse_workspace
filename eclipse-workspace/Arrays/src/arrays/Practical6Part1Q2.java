/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class Practical6Part1Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double[] temperatures = { 3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1 };
		
		double total = 0;
		for (int loop=0; loop<temperatures.length; loop++) {
			total+=temperatures[loop];
			System.out.print(temperatures[loop]+",");
		}
		System.out.println("\nThe total is "+total);
		
		double average = total/temperatures.length;
		System.out.printf("The average is: %.2f\n",average);
		
		double max = temperatures[0];
		
		for (int loop = 0; loop<temperatures.length; loop++) {
			if (max<temperatures[loop]) {
				max = temperatures[loop];
			}
		}
		System.out.println("The maximum is : "+max);
		
		double min = temperatures[0];
		
		for (int loop = 0; loop<temperatures.length; loop++) {
			if (min>temperatures[loop]) {
				min = temperatures[loop];
			}
		}
		System.out.println("The minimum is : "+min);
	}

}
