/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */

import java.util.Arrays;

public class ArraysQuiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] myArray = { 2, 4, 6, 8, 10 };
		System.out.println(Arrays.toString(myArray));
		System.out.println(calTotal(myArray));
		updateArray(myArray, 3);
		System.out.println(Arrays.toString(myArray));
		System.out.println(calTotal(myArray));
	}

	public static void updateArray(int[] array, int seed) {
		for (int loop = 0; loop < array.length; loop++) {
			array[loop] += seed;
		}
	}

	public static int calTotal(int[] array) {
		int total = 0;
		for (int number : array) {
			total += number;
		}
		return total;
	}
}
