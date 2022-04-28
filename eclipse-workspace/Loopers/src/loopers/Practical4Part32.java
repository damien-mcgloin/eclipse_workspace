/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class Practical4Part32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int loop = 10; loop>0; loop--) {
			System.out.print(loop+",");
			
		}
		System.out.print("Liftoff!\n");
		
		int loop = 10;
		while (loop>0) {
			System.out.print(loop+",");
			loop--;
		}
		System.out.print("Liftoff!");

	}

}
