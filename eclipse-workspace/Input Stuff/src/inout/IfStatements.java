/**
 * 
 */
package inout;

/**
 * @author damienmcgloin
 *
 */
public class IfStatements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declare the vars
		int num1, num2;
		
		// assign a value
		num1 = 9;
		num2 = 5;
		
		if (num1 < num2) {
			System.out.println(num1+ " is less than "+num2);
		}
		
		if (num1 == num2) {
			System.out.println(num1+ " is same as "+num2);
		}
		if (num1 <= num2) {
			System.out.println(num1+ " is less than or equal to "+num2);
		}
	}

}
