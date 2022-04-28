/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class ArrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] myArray; 
		myArray = new int[10];
		
		// the first value
		myArray[0] = 66;
		System.out.println(myArray[0]);
		myArray[0] = 33;
		System.out.println(myArray[0]);
		
		myArray[9] = 999;
		System.out.println(myArray[9]);
		
		for (int loop=0; loop<myArray.length; loop++) {
			System.out.println("myArray["+loop+"] "+myArray[loop]);
		}

	}

}
