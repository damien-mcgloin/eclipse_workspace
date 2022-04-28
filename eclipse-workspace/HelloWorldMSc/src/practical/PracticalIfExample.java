/**
 * 
 */
package practical;

/**
 * @author damienmcgloin
 *
 */
public class PracticalIfExample {

	/**
	 * This is the final section of practical 2 week 1
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare two int statements
		int number1, number2;
		number1 = 44;
		number2 = 44;

		// Use if statements to print the biggest value
		if (number1 >= number2) {
			System.out.println(number1);
		} else {
			System.out.println(number2);
		} //end of if statement
		
		// declare four into statements
		int yearOfBirth, yearWhenITurn21, yearWhenITurn40, yearWhenIRetireAt60;
		// Initialize yearOfBirth
		yearOfBirth = 1990;
		yearWhenITurn21 = yearOfBirth + 21;
		yearWhenITurn40 = yearOfBirth + 40;
		yearWhenIRetireAt60 = yearOfBirth + 60;
		
		System.out.println("Birth : " +yearOfBirth);
		System.out.println("Turn 21 : " +yearWhenITurn21);
		System.out.println("Turn 40 : " +yearWhenITurn40);
		System.out.println("Retire : " +yearWhenIRetireAt60);
		
	} //end of class

} //end of package
