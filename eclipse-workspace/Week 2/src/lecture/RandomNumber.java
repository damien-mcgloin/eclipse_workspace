/**
 * 
 */
package lecture;

// class imports
import java.util.Random;
/**
 * Class used to demo import statements using a
 * random number generator
 * @author damienmcgloin
 *
 */
public class RandomNumber {

	/**
	 * Main method.. generates a range of random numbers using the
	 * Java API Random class
	 * @param args
	 */
	public static void main(String[] args) {
		// variable declaration
		int randomInt;
		
		System.out.println("Generating 5 random intergers in range 0..99.");

		// note a single Random object is reused here
		Random randomGenerator = new Random();
		for (int loop = 1; loop <= 5; loop++) {
			randomInt = randomGenerator.nextInt(100);
			System.out.println("Generated : " + randomInt);
		}
		System.out.println("Done");
	}

}
