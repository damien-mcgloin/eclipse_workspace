/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class EnhancedFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] numbers = { 2, 4, 6, 8, 10, 12 };
		
		String[] names = {"Aidan", "Claire", "Niamh", "Una", "Myla"};
		
		for (int loop=0;loop<numbers.length;loop++) {
			System.out.print(numbers[loop]+" ");
		}
		
		// enhanced for loop...
		for (int number : numbers) {
			System.out.print(number+" ");
			number++; // enhanced for is a read only operation
			// can't change it
		}
		
		for (String name : names) {
			System.out.println(name);
		}

	}

}
