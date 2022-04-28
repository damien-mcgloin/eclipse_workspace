/**
 * 
 */
package exceptional;

/**
 * @author damienmcgloin
 *
 */
public class DefinedExc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			int a, b, c;
			a = 9;
			b = 0;
			c = a / b;
			System.out.println("Maths done !");
		} catch (ArithmeticException artithmeticException) {
			System.out.println("Numbers problem");
		} catch (Exception exception) {
			System.out.println("General exception");
		} finally {
			System.out.println("Good bye thanks for using the system");
		}

	}

}
