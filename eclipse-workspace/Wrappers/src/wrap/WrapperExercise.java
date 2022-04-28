/**
 * 
 */
package wrap;

/**
 * @author damienmcgloin
 *
 */

import java.util.Arrays;

public class WrapperExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i1 = 33;
		String i2 = "999";
		double i3 = 23.4;
		
		//note change from slide
		Integer i4 = 4;
		
		int i5 = 67;
		int i6 = 31;
		String i7 = "60";
		double i8 = 22.2;
		int i9 = -22;
		
		// Store all in an array
		Double [] numbers = new Double[9];
		
		numbers[0] = new Double(i1);
		numbers[1] = new Double(i2);
		numbers[2] = i3;
		numbers[3] = i4.doubleValue();
		
		
		numbers[4] = new Double(i5);
		numbers[5] = new Double(i6);
		
		
		numbers[6] = Double.parseDouble(i7);
		numbers[7] = i8;
		numbers[8] = new Double(i9);
		
		/**
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		*/
		
		System.out.println("Unsorted : ");
		for (int loop = 0; loop < numbers.length; loop++) {
			Arrays.sort(numbers);
			System.out.println(numbers[loop]);
		}

	}

}
