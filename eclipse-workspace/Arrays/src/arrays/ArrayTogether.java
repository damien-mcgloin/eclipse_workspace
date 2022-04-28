/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class ArrayTogether {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declare the array
		int[] ages = { 2, 4, 6, 4, 5, 7, 8, 6 };

		/*
		 * // or int[] ages = new int[8]; 
		 * ages[0] = 2; 
		 * // etc
		 */

		displayAll(ages);
		System.out.println("Average age " + averageAge(ages));
		System.out.println("Min age : " + minAge(ages));
		System.out.println("Max age : " + maxAge(ages));
	}

	/**
	 * Displays all ages to screen
	 * 
	 * @param ageArray
	 */
	public static void displayAll(int[] ageArray) {
		System.out.println("All ages");
		for (int loop = 0; loop < ageArray.length; loop++) {
			System.out.println(ageArray[loop] + " ");
		}
	}

	/**
	 * Calculates and returns the average age
	 * 
	 * @param ageArray
	 * @return
	 */
	public static int averageAge(int[] ageArray) {
		int total = 0;
		for (int loop = 0; loop < ageArray.length; loop++) {
			total += ageArray[loop];
		}
		return total / ageArray.length;
	}

	/**
	 * Calculates and returns the max age
	 * 
	 * @param ageArray
	 * @return
	 */
	public static int maxAge(int[] ageArray) {
		/* 
		 * setting the initial value to the first value in the array
		 * could also default to zero in the context of the expected data in the 
		 * array - but consider the other data eg temperatures that may have negative numbers
		 * where 0 may be be appropriate - 
		 * also note here there is no validation (the array may be empty)
		 */
		// 
		int max = ageArray[0];
		for (int loop = 0; loop < ageArray.length; loop++) {
			if (max < ageArray[loop]) {
				// found a new max so keeping a record of it
				max = ageArray[loop];
			}
		}
		return max;
	}

	/**
	 * Min age finder
	 * 
	 * @param ageArray
	 * @return
	 */
	public static int minAge(int[] ageArray) {
		int min = ageArray[0];
		for (int loop = 0; loop < ageArray.length; loop++) {
			if (min > ageArray[loop]) {
				// found a new min so keeping a record of it
				min = ageArray[loop];
			}
		}
		return min;
	}
}


	