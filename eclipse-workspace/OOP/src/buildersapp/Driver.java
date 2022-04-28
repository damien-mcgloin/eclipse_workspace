/**
 * 
 */
package buildersapp;

/**
 * @author damienmcgloin
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Starting application");
		
		SimpleCalc simpleCalc = new SimpleCalc();
		
		simpleCalc.add(5, 10);
		simpleCalc.divide(10, 2);
		simpleCalc.multiply(5, 25);
		simpleCalc.subtract(10, 5);
		
		System.out.println("End of application");

	}

}
