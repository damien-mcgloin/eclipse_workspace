/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class PracticalPart33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int num = 10; num>0; num--) {
			System.out.print(num+",");
		}
		System.out.println("Liftoff!");
		
		int num = 10;
		
		while (num>0) {
			System.out.print(num+",");
			num--;
		}
		System.out.print("Liftoff!");
	}

}
