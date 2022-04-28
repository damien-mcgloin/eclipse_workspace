/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class NotReinventWheel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double[] temperatures = { 3.14, 2.55, 6.98, 2.24, 1.55 };
		
		for(int loop = 0; loop<temperatures.length; loop++) {
			//System.out.print(temperatures[loop]+",");
		if (temperatures[loop]!=temperatures.length-1) {
			System.out.print(temperatures[loop]+",");
		}
		}

	}

}
