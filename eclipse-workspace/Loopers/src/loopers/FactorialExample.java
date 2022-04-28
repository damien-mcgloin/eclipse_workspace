/**
 * 
 */
package loopers;

/**
 * @author damienmcgloin
 *
 */

public class FactorialExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * Create an application that when given an input from the
		 * user will use a for loop to calculate the factorial result
		 */
		
		// declare the vars
		int number, total;
		// the factorial number (simulated from user input)
		number = 4;
		// set the number to the first part of the calculation eg 4 * 3 etc
		total = number;
		System.out.print(number + "! = " +number + " x ");
		for (int loop = number - 1; loop >=1; loop--) {
			System.out.print(loop);
			
			if (loop != 1) {
				System.out.print(" x ");
			} else {
				System.out.print(" = ");
			}
			// do the maths
			total *= loop;
			// or total = total * loop;
		}
		
		// output the final value
		System.out.println(total);

	}

}
