/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class FirstArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declare
		int[] shoes = new int[5];
		
		// assign a value
		shoes[0] = 2;
		shoes[1] = 4;
		shoes[2] = 6;
		shoes[3] = 8;
		shoes[4] = 10;
		
		// show access an element
		System.out.println(shoes[0]);
		System.out.println(shoes[1]);
		System.out.println(shoes[2]);
		System.out.println(shoes[3]);
		System.out.println("Looping");
		
		for (int count = 0;count<shoes.length;count++) {
			System.out.println(shoes[count]);
		}
		
	}

}
