/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */

import java.util.Arrays;

public class CodeBreaker2 {

	/**
	 * @param args
	 */
	
	
	public static void decoder(int[] asciiCode) {
		
		char[] userLetter = new char[asciiCode.length];
		
		for (int loop=0; loop<asciiCode.length;loop++) {
			asciiCode[loop] = userLetter[loop];
			System.out.println(Arrays.toString(userLetter));
		}
		
	}

	public static void encoder(String name) {

		char[] nameLetters;

		nameLetters = new char[name.length()];

		int encoder = 0;

		for (int loop = 0; loop < name.length(); loop++) {
			nameLetters[loop] = name.charAt(loop);
			encoder = nameLetters[loop];
			System.out.println(encoder);
		}

	}

	public static void main(String[] args) {

		int[] asciiCode = { 68, 97, 109, 105, 101, 110, 32, 77, 99, 71, 108, 111, 105, 110 };

		//encoder("Damien McGloin");
		decoder(asciiCode);

	}

}
