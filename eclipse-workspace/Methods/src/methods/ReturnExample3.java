/**
 * 
 */
package methods;

/**
 * @author damienmcgloin
 *
 */
public class ReturnExample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(exponentCalculation(5,3));

	} // end of main method
	
	public static double exponentCalculation(double number, double power) {
		
		double exponent;
		
		exponent = Math.pow(number, power);
		
		return exponent;
		
	} // end of calculation method

}
