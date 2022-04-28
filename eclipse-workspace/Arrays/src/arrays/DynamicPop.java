/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class DynamicPop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] myArray = new int[10];
		for (int loop=0;loop<myArray.length;loop++) {
		myArray[loop] = 2 + 2*loop;
		}

		 // show
		for (int loop=0;loop<myArray.length;loop++) {
		System.out.println(myArray[loop]);
		}
		int total=0;
		// sum it up
		for (int loop=0;loop<myArray.length;loop++) {
		total+=myArray[loop];
		}
		// average
		System.out.println(total/myArray.length);

	}

}
