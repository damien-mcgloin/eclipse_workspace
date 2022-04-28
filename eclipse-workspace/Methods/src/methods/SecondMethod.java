/**
 * 
 */
package methods;

/**
 * @author damienmcgloin
 *
 */
public class SecondMethod {

	/**
	 * start point for this program... this is our first method based class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("In main start");
		invokeMe();
		yearTurn100();
		invokeName(5, "Damien");
		countDown(5);
		min(21,7);
		max(25, 12);
		average(5, 19, 42, 16);
		System.out.println("In main at end");
	} // end of main method

	/**
	 * This method prints a message to screen
	 */
	public static void invokeMe() {

		System.out.println("You invoked me!");

	} // end of invoke method

	/**
	 * This method prints my name to screen
	 */
	public static void yearTurn100() {

	int currentAge, currentYear, yearTurning100;
	currentAge = 30;
	yearTurning100 = 0;
	currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
	yearTurning100 = 100 - currentAge + currentYear;
	System.out.println("Year turning 100 is : "+yearTurning100);
	
	} // end of age method
	
	/**
	 * This method prints a name to screen a number of times
	 * @param count - the number of times the statement is printed
	 * @param name - the name which will be printed
	 */
	public static void invokeName(int count, String name) {
		for (int loop = 1; loop<=count; loop++) {
			System.out.println(name);
		}
		
	} // end of name method
	
	public static void countDown(int start) {
		
		for (; start>=0; start--) {
			System.out.println(start);
		}
	} // end of countDown method
	
	public static void min(int min, int max) {
		if (min<=max) {
			System.out.println("min equals : "+min);
		} else {
			System.out.println("min equals : "+max);
		}
		
	} // end of min method
	
	public static void max(int min, int max) {
		if (max>=min) {
			System.out.println("max equals : "+max);
		} else {
			System.out.println("max equals : "+min);
		}
		
	} // end of max method
	
	public static void average(int num1, int num2, int num3, int num4) {
		
		int total = num1+num2+num3+num4;
		double avg = (double)total/4;
		System.out.println("The average is : "+avg);
		
	} // end of average method

} // end of class
