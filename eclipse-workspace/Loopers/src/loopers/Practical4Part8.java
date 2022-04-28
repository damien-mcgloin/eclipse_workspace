/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */
public class Practical4Part8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int outer = 1; outer<=3; outer++) {
			for (int inner = 1; inner<=10; inner++) {
				if (outer==1) {
					System.out.print("* "+inner);
				} else if (outer == 2) {
					System.out.print("** "+inner);
				} else {
					System.out.print("*** "+inner);
				}
				if (inner!=10) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}
	
}
