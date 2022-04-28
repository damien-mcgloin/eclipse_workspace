/**
 * 
 */
package recap;

/**
 * @author damienmcgloin
 *
 */
public class IfStatements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		num1 = 8;
		num2 = 80;
		num3 = 16;
		
		// This is a block of code about If statements
		if (num1==num3) { 
			// body of the If statement
			System.out.println("Nums are the same");
		} // end of If statement
		
		if (num1!=num2) {
			System.out.println("Nums not the same");
		}
		
		if (num1<num2) {
			System.out.println("Num1 is smaller than Num2");
		}

	} // end of the main method

} // end of the class
