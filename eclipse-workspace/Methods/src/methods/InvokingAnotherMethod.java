/**
 * 
 */
package methods;

/**
 * @author damienmcgloin
 *
 */
public class InvokingAnotherMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main");
		InvokingAnotherMethod.invokeName();
		yearTurn100();
		System.out.println("end main");
	} // end of main method

	public static void invokeName() {
		
			System.out.println("Damien");
			

		
	} // end of print method
	
	public static void yearTurn100() {
		
		int currentAge, currentYear, yearTurning100;
		
		currentAge = 30;
		yearTurning100=0;
		currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		yearTurning100 = 100 - currentAge + currentYear;
		System.out.println("Year turning 100 is : "+ yearTurning100);
		
	} // end of year method

} // end of class
