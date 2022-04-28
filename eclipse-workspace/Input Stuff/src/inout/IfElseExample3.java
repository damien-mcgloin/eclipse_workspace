/**
 * 
 */
package inout;

/**
 * @author damienmcgloin
 *
 */
public class IfElseExample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare the vars
		int num1, num2;
		
		// assign a value to the vars
		num1 = 15;
		num2 = 20;
		
		// implement an if else statement
		if (num1>num2) {
			System.out.println("The biggest number is "+num1);
		} else if (num1<num2)
			System.out.println("The biggest number is "+num2);
		else {
			System.out.println("The numbers are the same");
		}

	}

}
