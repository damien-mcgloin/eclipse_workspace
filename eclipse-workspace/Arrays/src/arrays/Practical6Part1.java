/**
 * 
 */
package arrays;

/**
 * @author damienmcgloin
 *
 */
public class Practical6Part1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final double RATE = 11.50;
		int[] employeeWages = { 8, 7, 9, 7, 4, 6 };
		int total = 0;
		
		System.out.println("Monday ["+employeeWages[0]+"]");
		System.out.println("Tuesday ["+employeeWages[1]+"]");
		System.out.println("Wednesday["+employeeWages[2]+"]");
		System.out.println("Thursday ["+employeeWages[3]+"]");
		System.out.println("Friday ["+employeeWages[4]+"]");
		System.out.println("Saturday ["+employeeWages[5]+"]");
	
		for(int loop=0;loop<employeeWages.length;loop++) {
		total += employeeWages[loop];
		}
		
		System.out.println("Total working hours : "+total);
		double salary = total*RATE;
		System.out.println("Today salary for the week : "+ salary);

	}

}
