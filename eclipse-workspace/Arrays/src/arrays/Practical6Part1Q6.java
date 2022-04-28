/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class Practical6Part1Q6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] evenArray = new int[50];
		int nextFreeElement = 0;
		int total = 0;
		
		for (int loop=1; loop<=100; loop++) {
			if (loop%2 == 0) {
				// even number - add to array
				evenArray[nextFreeElement] = loop;
				// update to point to next free element
				nextFreeElement++;
			}
		}
		
		for (int i : evenArray) {
			total+=i;
		}
		System.out.println("total is : "+total);
		
		for (int loop=0; loop<evenArray.length; loop++) {
			System.out.println(evenArray[loop]);
			}
		} 
	
	public static void arrayToScreen(int[] myArray) {
		for (int loop=0; loop<myArray.length; loop++) {
			System.out.println(myArray[loop]);
		}
	}

	} 

