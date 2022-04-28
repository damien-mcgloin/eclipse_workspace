/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class Practical6Part1Q3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double[] heightArray = { 1.4, 1.9, 1.31, 1.2 };
		
		double total = 0;
		
		for (int loop = 0; loop<heightArray.length; loop++) {
			total+=heightArray[loop];
		}
		System.out.println("The total is : "+total);
		double average = total/heightArray.length;
		System.out.println("The average is "+average);
		
		double max = heightArray[0];
		for (int loop = 0; loop<heightArray.length; loop++) {
			if (max<heightArray[loop]) {
				max = heightArray[loop];
			}
		}
		System.out.println("The maximum is : "+max);
		
		double min = heightArray[0];
		for (int loop = 0; loop<heightArray.length; loop++) {
			if (min>heightArray[loop]) {
				min = heightArray[loop];
			}
		}
		System.out.println("The minimum is : "+min);
			
	}

}
