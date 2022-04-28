/**
 * 
 */
package challengesSmallenges;

import java.util.Arrays;

/**
 * @author damienmcgloin
 *
 */
public class CodeBreaker {

	/**
	 * @param args
	 */
	
	public static void decode(int[] array) {
		
		char[] userLetter = new char [array.length];
		
		for(int loop = 0; loop<array.length; loop++) {
			userLetter[loop] = (char) array[loop];
		}
		
		System.out.println(Arrays.toString(userLetter));
		
	}
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public static int encode(String name) {
		
		int encoder=0;
		
		for(int loop = 0; loop<name.length(); loop++) {
		encoder = (int)name.charAt(loop);
		System.out.print(encoder+(" "));
		}
		
		return encoder;
		
	}
	
	public static void main(String[] args) {
	
		int[] array = { 68, 97, 109, 105, 101, 110, 32, 77, 99, 71, 108, 111, 105, 110 };
		
		encode("Damien McGloin");
		System.out.println();
		decode(array);

	}

}
