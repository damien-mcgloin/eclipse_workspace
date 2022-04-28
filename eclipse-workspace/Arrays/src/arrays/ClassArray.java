/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class ClassArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] myArray = new int[3][4];
		System.out.println(myArray[0][0]);

		// last element first row
		System.out.println(myArray[0][3]);
		// second row first element
		System.out.println(myArray[1][0]);
		// last row last element
		System.out.println(myArray[2][3]);
		
		// assignment 
		myArray[0][0] = 999;
		System.out.println(myArray[0][0]);
		
		for (int row=0; row<myArray.length; row++) {
			for (int col=0; col<myArray[row].length;col++) {
				//System.out.printf("%10d" ,myArray[row][col]);
				System.out.print(myArray[row][col] + " ");
			}
			System.out.println();
		}

	}

}
