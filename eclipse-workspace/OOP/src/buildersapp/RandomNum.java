/**
 * 
 */
package buildersapp;

/**
 * @author damienmcgloin
 *
 */

import java.util.Random;

public class RandomNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Random random = new Random();
		
		for(int loop = 0; loop<16; loop++) {
			int randomGen = random.nextInt(9);
			System.out.print(randomGen);
		}
		
		

	}

}
