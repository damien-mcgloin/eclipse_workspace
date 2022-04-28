/**
 * 
 */
package ifstatements;

/**
 * @author damienmcgloin
 *
 */
public class LogicOps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String gender;
		int age;
		
		gender = "male";
		age = 55;
		
		// logical AND
		if (gender.equals("male") && age>40) {
			System.out.println("BOTH TRUE");
		}
		
		if (gender.equals("male") || age>40) {
			System.out.println("At least one is TRUE");
		}
		
		System.out.println("Bye");

	}

}
