/**
 * 
 */
package codility;

/**
 * @author damienmcgloin
 *
 */

import java.util.Arrays;

public class CodilityPractice {

	
	public static int solution(int[] A, int[] B) {
		
		// n is the length of A array ( 1, 3, 2, 1 )
	      int n = A.length;
	      // m is the length of B array ( 4, 2, 5, 3, 2 ) * extra semi colon removed here although it doesn't affect code
	        int m = B.length;
	        
	        // this sorts each array from 1 up
	        Arrays.sort(A);
	        Arrays.sort(B);
	        
	        int i = 0;
	        // this will count from 0 to the length of array A
	        for (int k = 0; k < n-1; ) {
	        	
	        	// if the loop is less than the length of Array B - 1 and Array B index 0 is less than Array A[loop] then add 1 to 0
	        	// changed to <= because if the array size is 1 then it's not running the line once you minus 1 and compare
	            if (i <= m - 1 && B[i] < A[k]) 
	                i += 1; else k += 1;
	          
	            
	            // this part should compare array A and array B
	            // i is increasing so cycling through B array and being compared to A array which is also cycling
	            if (A[k] == B[i])
	                return A[k];
	        	            
	        }
	        
	        return -1;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		int[] example = { 2, 1 };
		int[] example2 = { 3, 3 };
		
		System.out.println(solution(example, example2));

	}

}
