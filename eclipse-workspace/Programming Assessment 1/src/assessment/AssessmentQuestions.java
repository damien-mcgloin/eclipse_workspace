/**
 * 
 */
package assessment;

/**
 * @author damienmcgloin
 *
 */

import java.util.Scanner;

public class AssessmentQuestions {
	
	public static int largestArray(int[] num) {
		
		// TODO : output to screen the position (array index) of the largest value in the array
		int total = 0;
		int[] largest = num[0];
		
		for(int loop = 0; loop<num.length; loop++) {
			total+=num[loop];
			if(num[loop]>largest[loop]) {
				largest[loop] = num[loop];
			}
		}
		
		
		System.out.println("The largest is : "+largest);
		
		return total;
		
	}
	
	public static void updateArray(int[] myArray) {
		
		// TODO : update each element in the array by 5. e.g. the first element (initialed as 2) is updated to 7
		for(int loop = 0; loop<myArray.length; loop++) {
			System.out.print(myArray[loop]+5+" ");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		// TODO : output the elements of the array (on one line) (note a loop must be used for this)
		int[] myArray = {2,4,6,8,10};
		for(int loop = 0; loop<myArray.length; loop++) {
			System.out.print(myArray[loop]+" ");
		}
		System.out.println();
		updateArray(myArray);
		largestArray(myArray);

	}

}
