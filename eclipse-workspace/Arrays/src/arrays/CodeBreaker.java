/**
 * 
 */
package arrays;

import java.util.Arrays;

/**
 * @author damienmcgloin
 *
 */

public class CodeBreaker {

	/**
	 * @param args
	 */

	public static void decodeLikeABoss(int array[]) {
	
		String[] decoder = { "null" };
		char[] userLetter;
		userLetter = new char[array.length];
		
		for(int loop = 0; loop<array.length; loop++) {
			userLetter[loop] = (char) array[loop];
			userLetter[loop] = decoder[loop].charAt(loop);
			System.out.println(Arrays.toString(decoder));
		}
	}
	
	public static void codeMaster(String userName) {
		
		int encoder = 0;
		char[] userLetter;

		userLetter = new char[userName.length()];
		
		for (int loop = 0; loop < userName.length(); loop++) {
			userLetter[loop] = userName.charAt(loop);
			encoder = userLetter[loop];
			System.out.print(encoder+",");
		}
		
		
	}
		
	public static void main(String[] args) {

		codeMaster("Damien McGloin");
		System.out.println();
		
		int[] array = { 68, 97, 109, 105, 101, 110, 32, 77, 99, 71, 108, 111, 105, 110 };
		decodeLikeABoss( array );

		
	}

}
