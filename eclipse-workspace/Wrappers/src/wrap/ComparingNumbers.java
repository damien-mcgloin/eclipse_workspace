/**
 * 
 */
package wrap;

/**
 * @author damienmcgloin
 *
 */
public class ComparingNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer intW1 = new Integer(100);
		Integer intW2 = new Integer(10);
		
		if (intW1.equals(intW2)) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		
		System.out.println(intW1.compareTo(intW2));

	}

}
