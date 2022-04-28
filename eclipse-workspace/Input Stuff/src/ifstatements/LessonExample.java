package ifstatements;
/**
 * 
 */

/**
 * @author damienmcgloin
 *
 */
public class LessonExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 5;
		
		if (num1>num2) {
			System.out.println(num1 + " is the biggest.");
		} else if (num2>num1) {
			System.out.println(num2 + " is the biggest.");
		} else {
			System.out.println("The two numbers are the same");
		}

	}

}
