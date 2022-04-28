/**
 * 
 */
package inout;

/**
 * @author damienmcgloin
 *
 */
public class Conditionals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age;
		String gender;
		
		age = 60;
		gender = "female";
		
		// logical and
		if (gender.equalsIgnoreCase("male") && age<40) {
			System.out.println("male and under 40");
		}
		// logical or
		if (gender.equalsIgnoreCase("female") || age>40) {
			System.out.println("female and/or over 40");
		}

	}

}
